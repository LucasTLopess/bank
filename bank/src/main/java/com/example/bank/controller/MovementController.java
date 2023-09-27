package com.example.bank.controller;

import com.example.bank.model.Movement;
import com.example.bank.repository.MovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movements")
public class MovementController {

    @Autowired
    private MovementRepository movementRepository;

    @GetMapping
    public List<Movement> getAllMovements() {
        return movementRepository.findAll();
    }

    @GetMapping("/{id}")
    public Movement getMovementById(@PathVariable Long id) {
        return movementRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Movement createMovement(@RequestBody Movement movement) {
        return movementRepository.save(movement);
    }


    @DeleteMapping("/{id}")
    public void deleteMovement(@PathVariable Long id) {
        movementRepository.deleteById(id);
    }
}

