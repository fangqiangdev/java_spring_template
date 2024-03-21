package ddd.provder.repository;

import ddd.infrastructure.impl.dao.GoodsDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 为什么这个类不放在 goods-impl中 ？ 因为如果放在goods-impl中，就必须要依赖infrastructure 模块了（依赖infrastructure层的DAO）。 domain层不应该依赖任何模块
 */
public class GoodsRepositoryImpl {


    @Autowired
    private GoodsDAO goodsDAO;
}
