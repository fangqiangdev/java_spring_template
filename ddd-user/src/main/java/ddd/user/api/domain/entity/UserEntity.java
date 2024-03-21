package ddd.user.api.domain.entity;

import lombok.Data;

/**
 * @author xiudao
 * @date 2023/12/6
 */
@Data
public class UserEntity {
    private String id;
    private String name;
    private int money;
}