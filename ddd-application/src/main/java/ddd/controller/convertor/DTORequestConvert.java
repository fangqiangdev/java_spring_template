package ddd.controller.convertor;

import ddd.biz.api.request.UserRequest;
import ddd.controller.request.UserDTO;


/**
 * @author xiudao
 * @date 2023/12/6
 */

public abstract class DTORequestConvert {
    public UserRequest toUserRequest(UserDTO saveRequest){
        return null;
    }
}
