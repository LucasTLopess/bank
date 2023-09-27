package com.example.bank.controller.dto;

import com.example.bank.model.Investment;

public record InvestmentDTO (
    Long id,
    Integer type,
    Integer duration,
    Integer returnRate
){
    public Investment toInvestment() {
        return new Investment(type, duration, returnRate);
    }

    public static InvestmentDTO from(Investment investment) {
        return new InvestmentDTO(
            investment.getId(),
            investment.getType(),
            investment.getDuration(),
            investment.getReturnRate()
        );
    }
}
