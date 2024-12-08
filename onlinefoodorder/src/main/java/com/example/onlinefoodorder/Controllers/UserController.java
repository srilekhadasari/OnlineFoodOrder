package com.example.onlinefoodorder.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.onlinefoodorder.Entities.Users;
import com.example.onlinefoodorder.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/api/register")
    public String postMethodName(@RequestBody Users user) {
       
        userRepository.save(user);
        return "User Inserted";
    }
    
    
}
