package com.example.chan.mapper;

import com.example.chan.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    void addUser(User user);

    User getUserById(int id);

    void deleteUserById(int id);

    void updateUser(User user);
}
