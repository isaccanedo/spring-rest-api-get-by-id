package br.com.isaccanedo.controller;

import br.com.isaccanedo.model.UserModel;
import br.com.isaccanedo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

/**
 * @author Isac Canedo
 */

@RestController
@RequestMapping("/api")
public class UserController {

@Autowired
    private UserService userService;

@GetMapping("/user/{id}")
    public Optional<UserModel> getId(@PathVariable(value = "id") Long user_id) {
    return userService.getById(user_id);
}

}
