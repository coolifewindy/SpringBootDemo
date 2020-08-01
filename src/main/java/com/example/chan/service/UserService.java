package com.example.chan.service;

import com.example.chan.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void addUser(User user);

    User getUserById(int id);

    void deleteUserById(int id);

    void updateUser(User user);
}
