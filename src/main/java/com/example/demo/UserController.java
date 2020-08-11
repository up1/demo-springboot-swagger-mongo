package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public List<User> getAll() {
        return new ArrayList<>();
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
