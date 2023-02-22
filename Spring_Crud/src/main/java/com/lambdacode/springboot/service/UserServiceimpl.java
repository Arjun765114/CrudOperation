package com.lambdacode.springboot.service;

import com.lambdacode.springboot.entity.User;
import com.lambdacode.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public void adduser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public void updateuser(Integer id, User user) {
        userRepository.findById(id);
        user.setId(id);
        userRepository.save(user);
    }

    @Override
    public void deletuser(Integer id) {
       userRepository.deleteById(id);
    }
}
