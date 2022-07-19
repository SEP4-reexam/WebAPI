package com.WebAPI.SEP4.service;

import com.WebAPI.SEP4.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    User findUserById(int id);
    User register(User user);
    User updateUser(User user);
    void deleteUser(User user);
}


