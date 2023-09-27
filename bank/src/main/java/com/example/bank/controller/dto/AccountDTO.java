package com.example.bank.controller.dto;


import com.example.bank.model.Account;

public record AccountDTO(
    Long id,
    String name,
    Integer number,
    Integer status,
    Integer balance,
    InvestmentDTO investment,
    UserClientDTO userClient){

    public Account toAccount() {
        return new Account(
            number,
            balance,
            status,
            investment.toInvestment(),
            userClient.toUserClient()
        );
    }

    public static AccountDTO from(Account account) {
        return new AccountDTO(
            account.getId(),
            account.getUserClient().getName(),
            account.getNumber(),
            account.getStatus(),
            account.getBalance(),
            InvestmentDTO.from(account.getInvestment()),
            UserClientDTO.from(account.getUserClient())
        );
    }
}
