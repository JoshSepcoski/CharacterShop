package com.example.characterShop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.characterShop.model.User;
import com.example.characterShop.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @GetMapping("/users/")
    public Iterable<User> getUsers() {
        return userRepository.findAll(); 
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping("/users/")
    public HttpStatus addUser(@RequestBody User user){
        userRepository.save(user);

        return HttpStatus.CREATED;
    }

}