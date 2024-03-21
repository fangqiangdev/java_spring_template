package ddd.biz.api.service.impl;

import ddd.biz.api.request.UserRequest;
import ddd.biz.api.convertor.DTODOConvertor;

import ddd.biz.api.service.UserBizUpdateService;
import ddd.common.helper.TransactionHelper;
import ddd.goods.api.entity.Goods;
import ddd.goods.api.repository.GoodsRepository;
import ddd.goods.api.service.GoodsDomainService;
import ddd.infrastructure.impl.service.MailService;
import ddd.user.api.domain.entity.UserEntity;
import ddd.user.api.domain.event.UserCreatedEvent;
import ddd.user.api.domain.event.UserUpdatedEvent;
import ddd.user.api.domain.repository.UserRepository;
import ddd.user.api.domain.service.UserDomainService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 跨领域协作
 *
 * 【业务流程】的编排。可能涉及1个或多个领域中的1个或多个服务，实体（横向）
 */
public class UserBizUpdateServiceImpl implements UserBizUpdateService {

    @Autowired
    private UserDomainService userDomainService;
    @Autowired
    private GoodsDomainService goodsDomainService;
    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DTODOConvertor userConvert;
    @Autowired
    private MailService mailService;
    @Autowired
    private TransactionHelper transactionHelper;

    @Override
    public void createUser(UserRequest request){
        validParam(request);
        // 构建DO对象是application层的事，如果非常复杂可用工厂模式等
        UserEntity user = userConvert.toUser(request);
        userRepository.save(user);
        // 事件发布是在application层的事
        publish(new UserCreatedEvent());
        return;
    }

    @Override
    public void changeName(UserRequest request){
        validParam(request);
        // 简单业务直接调用repository获取实体，直接实体对象
        UserEntity user = userRepository.load(request.getId());
        user.setName(request.getName());
        userRepository.save(user);
        publish(new UserUpdatedEvent());
        return;
    }
    @Override
    public void trade(String userId1, String userId2, int money){
        UserEntity user1 = userRepository.load(userId1);
        UserEntity user2 = userRepository.load(userId2);
        // 事务在application service层处理
        transactionHelper.execute(()-> {
            // 复杂业务需要用domain service封装处理
            userDomainService.trade(user1, user2, money);
            userRepository.save(user1);
            userRepository.save(user2);
            publish(new UserUpdatedEvent());
        });
    }

    @Override
    public void buy(String userId, String goodsId, int count, int price) {
        // 涉及多个领域对象
        UserEntity user = userRepository.load(userId);
        Goods goods = goodsRepository.load(goodsId);

        userDomainService.spendMoney(user, count * price);
        goodsDomainService.sell(goods, 10);

        transactionHelper.execute(()-> {
            userRepository.save(user);
            goodsRepository.save(goods);
        });

        mailService.sendMail(user.getId(),"购买成功");
    }

    private void publish(UserUpdatedEvent userUpdatedEvent) { }
    private void publish(UserCreatedEvent event) {}
    private void validParam(UserRequest request) { }
}
