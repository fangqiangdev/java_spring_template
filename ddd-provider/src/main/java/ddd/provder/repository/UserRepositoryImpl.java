package ddd.provder.repository;

import ddd.user.api.domain.entity.UserEntity;
import ddd.user.api.domain.repository.UserRepository;

/**
 * @author xiudao
 * @date 2024/3/21
 */
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save(UserEntity user) {

    }

    @Override
    public UserEntity load(String id) {
        return null;
    }
}
