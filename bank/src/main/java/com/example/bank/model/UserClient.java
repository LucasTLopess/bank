package com.example.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class UserClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String cpf;
    private String username;
    private String password;
    private String email;

    public UserClient(String name, String cpf, String username, String password, String email) {
        this.name = name;
        this.cpf = cpf;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
