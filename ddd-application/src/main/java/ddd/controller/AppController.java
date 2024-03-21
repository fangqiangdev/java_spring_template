package ddd.controller;


import ddd.biz.api.service.UserBizUpdateService;
import ddd.biz.api.request.UserRequest;
import ddd.controller.convertor.DTORequestConvert;
import ddd.controller.request.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public class AppController {
    @Autowired
    private UserBizUpdateService userBizService;

    @Autowired
    private DTORequestConvert userConvert;
    public UserDTO createUser(UserDTO userDTO){
        UserRequest userRequest = userConvert.toUserRequest(userDTO);
        userBizService.createUser(userRequest);
        return null;
    }
}
