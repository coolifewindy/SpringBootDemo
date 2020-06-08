package com.example.demo5.extra;

import com.example.demo5.bean.User;

import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        User user =new User();
        user.setName(UUID.randomUUID().toString());
        System.out.println(user.getName());
    }
}
