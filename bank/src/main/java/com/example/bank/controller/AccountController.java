package com.example.bank.controller;

import com.example.bank.controller.dto.AccountDTO;
import com.example.bank.model.Account;
import com.example.bank.repository.AccountRepository;
import com.example.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

//    @GetMapping
//    public List<Account> getAllAccounts() {
//        return accountService.findAll();
//    }

    @GetMapping("/{id}")
    public AccountDTO get(@PathVariable Long id) {
        return AccountDTO.from(Objects.requireNonNull(accountService.findById(id).orElse(null)));
    }

    @PostMapping
    public Account create(@RequestBody AccountDTO accountDTO) {
        return accountService.save(accountDTO.toAccount());
    }

//    @PutMapping("/{id}")
//    public Account updateAccount(@PathVariable Long id, @RequestBody Account updatedAccount) {
//        if (accountService.existsById(id)) {
//            updatedAccount.setId(id);
//            return accountService.save(updatedAccount);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteAccount(@PathVariable Long id) {
//        accountService.deleteById(id);
//    }
}

