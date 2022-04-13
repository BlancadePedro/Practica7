package com.practica7.practica7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.practica7.practica7.model.User;
import com.practica7.practica7.repository.UserRepository;


@RestController
@RequestMapping("/api/v1")

@Service
public class UserController {

    @Autowired
    private UserRepository userRepostery;

    @GetMapping("/users")
    public ResponseEntity<Iterable<User>> getUser(){

       Iterable<User> response = userRepostery.findAll();
       return ResponseEntity.ok().body(response);
    }


    @PutMapping("/users/{id}/")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User user) {
        User newUser = userRepostery.save(user);
        if (newUser == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newUser);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable String id) {
        userRepostery.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    

}
