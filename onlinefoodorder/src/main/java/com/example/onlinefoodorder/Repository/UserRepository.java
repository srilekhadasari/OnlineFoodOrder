package com.example.onlinefoodorder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinefoodorder.Entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long>{


    
}
