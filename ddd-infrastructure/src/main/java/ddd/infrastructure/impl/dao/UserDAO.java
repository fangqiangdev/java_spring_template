package ddd.infrastructure.impl.dao;

import ddd.infrastructure.impl.po.UserPO;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public interface UserDAO {
    void save(UserPO userPO);
}
