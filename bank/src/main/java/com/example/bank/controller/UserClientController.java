package com.example.bank.controller;

import com.example.bank.model.UserClient;
import com.example.bank.repository.UserClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserClientController {

    @Autowired
    private UserClientRepository userClientRepository;

    @GetMapping
    public List<UserClient> getAllUsers() {
        return userClientRepository.findAll();
    }

    @GetMapping("/{id}")
    public UserClient getUserById(@PathVariable Long id) {
        return userClientRepository.findById(id).orElse(null);
    }

    @PostMapping
    public UserClient createUser(@RequestBody UserClient userClient) {
        return userClientRepository.save(userClient);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userClientRepository.deleteById(id);
    }
}
