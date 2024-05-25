package dio.apisantander.service;

import dio.apisantander.domain.model.UserModel;

public interface UserService {
    UserModel findById(Long id);

    UserModel create(UserModel userToCreate);
}
