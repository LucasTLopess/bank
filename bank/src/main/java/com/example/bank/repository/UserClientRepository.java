package com.example.bank.repository;

import com.example.bank.model.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserClientRepository extends JpaRepository<UserClient, Long> {
}
