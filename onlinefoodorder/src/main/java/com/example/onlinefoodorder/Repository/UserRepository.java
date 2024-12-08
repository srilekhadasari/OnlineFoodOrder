package com.example.onlinefoodorder.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinefoodorder.Entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long>{

Optional<Users> findByEmail(String email);
    
}
