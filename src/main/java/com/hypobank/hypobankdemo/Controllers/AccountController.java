package com.hypobank.hypobankdemo.Controllers;

import javax.security.auth.login.AccountExpiredException;

import com.hypobank.hypobankdemo.Repository.AccountRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/accounts")
@RestController
public class AccountController {
    
    private final AccountRepository accountRepository;

    public AccountController (AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    

}
