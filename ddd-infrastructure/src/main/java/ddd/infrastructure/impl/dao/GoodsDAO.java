package ddd.infrastructure.impl.dao;

/**
 * 为什么DAO要放在impl模块而不放在api模块中？  因为理论上外部不需要通过DAO获取数据，所以不建议放在api中暴露出去
 */
public interface GoodsDAO {
}
