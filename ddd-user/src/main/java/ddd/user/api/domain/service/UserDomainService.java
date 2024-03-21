package ddd.user.api.domain.service;


import ddd.user.api.domain.entity.UserEntity;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public interface UserDomainService {

    /**
     * 改成尽量不依赖任何service，只做纯逻辑处理，且都是内存操作（依赖的外部数据都通过参数传递进来）。这层不应该调用repository
     */
    public boolean trade(UserEntity user1, UserEntity user2, int money);

    public void spendMoney(UserEntity user, int money);
}
