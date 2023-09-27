package com.example.bank.controller.dto;

import com.example.bank.model.UserClient;

public record UserClientDTO(
    Long id,
    String name,
    String email,
    String username,
    String cpf,
    String password) {

    public UserClient toUserClient() {
        return new UserClient(name, cpf, username, password, email);
    }

    public static UserClientDTO from(UserClient userClient) {
        return new UserClientDTO(
            userClient.getId(),
            userClient.getName(),
            userClient.getEmail(),
            userClient.getUsername(),
            userClient.getCpf(),
            userClient.getPassword()
        );
    }
}
