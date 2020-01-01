package com.springboot.controller;

import com.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    User user;
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }

    @GetMapping(path="/user")
    public String user(){
        System.out.println(user);
        System.out.println("myName:" + myName);
        return user.toString();
    }
    @Value("${user.name}")
    String myName;
}
