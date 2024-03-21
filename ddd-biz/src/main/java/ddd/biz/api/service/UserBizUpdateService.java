package ddd.biz.api.service;


import ddd.biz.api.request.UserRequest;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public interface UserBizUpdateService {

    public void createUser(UserRequest request);

    public void changeName(UserRequest request);

    public void trade(String userId1, String userId2, int money);

    /**
     * 用户用特定价格买特定数量的商品
     */
    public void buy(String userId1, String goodsId, int count, int price);
}
