package ddd.infrastructure.impl.convertor;

import ddd.infrastructure.impl.po.UserPO;
import ddd.user.api.domain.entity.UserEntity;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public abstract class DOPOConvertor {
    public abstract UserPO to(UserEntity user);
}
