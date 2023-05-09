package com.pack.user.api.controller;


import com.pack.user.api.entity.User;
import com.pack.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/postUser")
    public User postUser(@RequestBody User user) {
        return userService.postUser(user);
    }

}
