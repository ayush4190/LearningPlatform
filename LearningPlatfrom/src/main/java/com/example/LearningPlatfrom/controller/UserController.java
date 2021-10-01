package com.example.LearningPlatfrom.controller;


import com.example.LearningPlatfrom.repository.UserDao;
import com.example.LearningPlatfrom.enitities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private  UserDao userDao ;

    @GetMapping(path = "/",
    produces = "application/json")
    public users getUsers(){
        return userDao.getAllUsers();

    }

    @PostMapping(
            path = "/",
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<Object> addUser(
            @RequestBody user user
    ){
        Integer id = userDao.getAllUsers().getUserList().size() + 1 ;

        user.setUserId(id);

        userDao.adduser(user);

        URI location
                = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        user.getUserId())
                .toUri();

        return ResponseEntity
                .created(location)
                .build();

    }





}
