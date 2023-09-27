package com.example.bank.service;

import com.example.bank.model.Investment;
import com.example.bank.repository.InvestmentRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestmentService {

    @Autowired
    private InvestmentRepository investmentRepository;

    public Optional<Investment> findById(Long id) {
        return investmentRepository.findById(id);
    }
    public Investment save(Investment investment) {
        return investmentRepository.save(investment);
    }
}
