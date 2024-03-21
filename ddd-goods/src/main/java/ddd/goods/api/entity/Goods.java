package ddd.goods.api.entity;

import lombok.Data;

/**
 * @author xiudao
 * @date 2023/12/6
 */
@Data
public class Goods {
    private String id;
    private String name;
    /**
     * 库存
     */
    private int count;
}
