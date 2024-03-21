package ddd.goods.api.repository;

import ddd.goods.api.entity.Goods;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public interface GoodsRepository {
    Goods load(String id);
    void save(Goods goods);
}
