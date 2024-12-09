package com.example.onlinefoodorder.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinefoodorder.Entities.Item;
import com.example.onlinefoodorder.Repository.ItemRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ItemController {

    @Autowired
     ItemRepository itemRepository;

     @PostMapping("/api/add_item")
     public String addItem(@RequestBody Item item) {
         itemRepository.save(item);
         return "Item Added";
     }

     @GetMapping("/api/get_items")
     public List<Item> getAllItems() {
        ArrayList<Item> getItems= (ArrayList<Item>) itemRepository.findAll();
         return getItems;
     }
     
     @GetMapping("/api/getitem/{id}")
     public Item getItemById(@PathVariable Long id) {
        Optional<Item> item= itemRepository.findById(id);
        if(item.isPresent()) return item.get();
        throw new RuntimeException("item not found");
     }
     
     @DeleteMapping("/api/remove_item/{id}")
     public String removeItemById(@PathVariable Long id) {
        Optional<Item> item=itemRepository.findById(id);
         itemRepository.delete(item.get());
         return "Item Deleted";
    
     }

     
}
