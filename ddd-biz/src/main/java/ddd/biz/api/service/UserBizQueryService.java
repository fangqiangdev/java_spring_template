package ddd.biz.api.service;


import ddd.biz.api.request.UserRequest;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public interface UserBizQueryService {

    public void page(UserRequest request);

}
