package ddd.goods.api.service;

import ddd.goods.api.entity.Goods;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public interface GoodsDomainService {
    void sell(Goods goods, int subCount);
}
