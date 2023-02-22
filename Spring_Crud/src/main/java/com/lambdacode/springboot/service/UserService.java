package com.lambdacode.springboot.service;

import com.lambdacode.springboot.entity.User;

import java.util.List;

public interface UserService {
    void adduser(User user);

    List<User> getUser();

    void updateuser(Integer id, User user);

    void deletuser(Integer id);
}
