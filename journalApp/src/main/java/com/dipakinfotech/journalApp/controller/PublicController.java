package com.dipakinfotech.journalApp.controller;

import com.dipakinfotech.journalApp.entity.User;
import com.dipakinfotech.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public")

public class PublicController {

    @Autowired
    private UserService userService;

    @GetMapping("/health-check")
    public String healthCheck(){
        return "Okk";
    }

    @PostMapping("/create-user")
    public List<User> createUser(@RequestBody User user){
        return userService.saveNewUser(user);
    }

}
