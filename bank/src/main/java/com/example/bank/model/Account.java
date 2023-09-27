package com.example.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number;
    private Integer balance;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "idUserClient")
    private UserClient userClient;

    @ManyToOne
    @JoinColumn(name = "idInvestment")
    private Investment investment;

    public Account(
        Integer number,
        Integer balance,
        Integer status,
        Investment investment,
        UserClient userClient
    ) {
        this.number = number;
        this.balance = balance;
        this.status = status;
        this.investment = investment;
        this.userClient = userClient;
    }

    public void setId(Long id) {
    }
}
