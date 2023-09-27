package com.example.bank.controller;
import com.example.bank.controller.dto.InvestmentDTO;
import com.example.bank.model.Investment;
import com.example.bank.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/investments")
public class InvestmentController {

    @Autowired
    private InvestmentService investmentService;


    @GetMapping("/{id}")
    public InvestmentDTO get(@PathVariable Long id) {
        return InvestmentDTO.from(Objects.requireNonNull(investmentService.findById(id).orElse(null)));
    }

    @PostMapping
    public Investment create(@RequestBody InvestmentDTO investmentDTO) {
        return investmentService.save(investmentDTO.toInvestment());
    }
}

