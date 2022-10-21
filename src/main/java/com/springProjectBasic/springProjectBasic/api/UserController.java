package com.springProjectBasic.springProjectBasic.api;

import com.springProjectBasic.springProjectBasic.entities.User;
import com.springProjectBasic.springProjectBasic.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/saveAll")
    public List<User> saveAllUser(@RequestBody List<User> users){
        users.forEach(user -> user.setPassword(""));
        users.forEach(user -> user.setName(user.getName()));
        System.out.println("Users were saved !!");
        return users;

    }

    @GetMapping("/getUserCountProc")
    public Integer get_user_count_proc(){
        return userService.get_user_count_proc();
    }
}
