package ddd.biz.api.convertor;

import ddd.biz.api.request.UserRequest;
import ddd.user.api.domain.entity.UserEntity;

/**
 * @author xiudao
 * @date 2023/12/6
 */

public abstract class DTODOConvertor {
    public UserEntity toUser(UserRequest saveRequest){
        return null;
    }
}
