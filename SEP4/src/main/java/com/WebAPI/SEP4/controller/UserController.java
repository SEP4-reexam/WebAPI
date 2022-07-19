package com.WebAPI.SEP4.controller;

import com.WebAPI.SEP4.entities.User;
import com.WebAPI.SEP4.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sauna/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User register(@RequestBody User user){
        return userService.register(user);
    }
    @GetMapping("/{id}")
   public User findUserById(@PathVariable int id){
        return userService.findUserById(id);
   }
    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
