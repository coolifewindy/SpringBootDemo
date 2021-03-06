package com.example.chan.controller;

import com.example.chan.bean.User;
import com.example.chan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/user")
    public void addUser(User user){
        userService.addUser(user);
    }

    @GetMapping("/getUserById")
    public User getUserById(int id){
        return userService.getUserById(id);
    }
    @DeleteMapping("/user")
    public void delete(int id){
        userService.deleteUserById(id);
    }
    @PutMapping("/user")
    public void updateUser(User user){
        userService.updateUser(user);
    }
}
