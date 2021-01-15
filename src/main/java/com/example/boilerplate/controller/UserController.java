package com.example.boilerplate.controller;

import com.example.boilerplate.dto.BusinessException;
import com.example.boilerplate.entity.Users;
import com.example.boilerplate.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(path = "api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/create")
    public ResponseEntity createUser(@RequestBody Users user) {
        userService.save(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity findUser(@PathVariable Integer id) throws BusinessException {
        Users users = userService.findOneById(id);
        return ResponseEntity.ok(users);
    }
}
