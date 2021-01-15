package com.example.boilerplate.service.impl;

import com.example.boilerplate.entity.Users;
import com.example.boilerplate.repository.UserRepository;
import com.example.boilerplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(Users users) {
        userRepository.save(users);
    }

    @Override
    public Users findOneById(Integer id) {
        return userRepository.findOneById(id);
    }
}
