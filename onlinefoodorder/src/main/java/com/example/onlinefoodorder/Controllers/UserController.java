package com.example.onlinefoodorder.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.onlinefoodorder.Entities.Users;
import com.example.onlinefoodorder.Repository.UserRepository;
import com.example.onlinefoodorder.Services.UserService;
import com.example.onlinefoodorder.Utility.UserLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    
    @Autowired
    UserService userService;

    @PostMapping("/api/register")
    public String userRegistration(@RequestBody Users user) {
       
        userRepository.save(user);
        return "User Inserted";
    }

    @PostMapping("/api/login")
    public String userLogin(@RequestBody UserLogin userLogin) {
       Boolean value= userService.checkUser(userLogin);
       if(value){
        return "User Found";
       }
        return "Invalid credentials";
    }


    
    
    
}
