package com.lz.server.controller;

import com.lz.server.entity.User;
import com.lz.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User>  query(){
        List<User> list = userMapper.find();
        System.out.println(list);
        return list;
    }
}