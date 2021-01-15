package com.example.boilerplate.service;

import com.example.boilerplate.entity.Users;

public interface UserService {
    void save(Users users);

    Users findOneById(Integer id);
}
