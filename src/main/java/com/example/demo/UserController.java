package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAll() {
        List<User> users =  userRepository.findAll();
        return users;
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable int id) {
        return new User();
    }

    @PostMapping("/user")
    public void create() {
    }

    @DeleteMapping("/user")
    public void delete() {
    }

    @PutMapping("/user")
    public void update() {

    }

}
