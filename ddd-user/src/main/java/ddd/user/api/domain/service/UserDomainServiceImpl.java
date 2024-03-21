package ddd.user.api.domain.service;



import ddd.user.api.domain.entity.UserEntity;
import ddd.user.api.domain.service.UserDomainService;
import org.springframework.stereotype.Service;

/**
 * 【业务规则】的封装。可能涉及1个或多个实体的复杂逻辑 （纵向）
 */
@Service
public class UserDomainServiceImpl implements UserDomainService {

    /**
     * 方法必须是无状态，不能有持久化之类的逻辑。
     * 这层尽量不依赖任何service，只做纯逻辑处理，且都是内存操作，依赖的外部数据都通过参数传递进来
     */
    @Override
    public boolean trade(UserEntity user1, UserEntity user2, int money){
        user1.setMoney(user1.getMoney()+money);
        user2.setMoney(user1.getMoney()-money);
        return true;
    }

    @Override
    public void spendMoney(UserEntity user, int money) {
        user.setMoney(user.getMoney()-money);
    }

}
