package com.example.onlinefoodorder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinefoodorder.Entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {

}