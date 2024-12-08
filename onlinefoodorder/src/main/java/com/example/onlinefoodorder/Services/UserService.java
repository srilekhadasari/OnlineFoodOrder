package com.example.onlinefoodorder.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinefoodorder.Entities.Users;
import com.example.onlinefoodorder.Repository.UserRepository;
import com.example.onlinefoodorder.Utility.UserLogin;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public boolean checkUser(UserLogin userLogin){
       Optional<Users> user=userRepository.findByEmail(userLogin.getEmail());
       if(user.isPresent()){
            if(user.get().getPassword().equals(userLogin.getPassword())) return true;
       }
       return false;
    }
}
