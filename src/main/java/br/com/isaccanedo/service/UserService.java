package br.com.isaccanedo.service;

import br.com.isaccanedo.model.UserModel;
import java.util.Optional;

/**
 * @author Isac Canedo
 */

public interface UserService {
    Optional<UserModel> getById(Long user_id);
}
