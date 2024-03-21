package ddd.biz.api.service.impl;

import ddd.biz.api.request.UserRequest;
import ddd.biz.api.service.UserBizQueryService;
import ddd.infrastructure.impl.dao.GoodsDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 查询服务
 */
public class UserBizQueryServiceImpl implements UserBizQueryService {

    @Autowired
    private GoodsDAO goodsDAO;

    @Override
    public void page(UserRequest request) {

    }
}
