package ddd.user.api.domain.repository;

import ddd.user.api.domain.entity.UserEntity;

/**
 * @author xiudao
 * @date 2023/12/6
 */
public interface UserRepository {
    void save(UserEntity user);
    UserEntity load(String id);
}
