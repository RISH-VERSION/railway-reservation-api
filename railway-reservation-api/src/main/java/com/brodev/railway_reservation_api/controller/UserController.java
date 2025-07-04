package com.brodev.railwayreservationapi.controller;

import com.brodev.railwayreservationapi.model.User;
import com.brodev.railwayreservationapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //  Register User
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    //  Get All Users (for testing)
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}