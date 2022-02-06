package com.hypobank.hypobankdemo.Functions;

import com.hypobank.hypobankdemo.AccountObjects.CheckingAccount;
import com.hypobank.hypobankdemo.Repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DatabaseLoader implements CommandLineRunner{

    private final AccountRepository repository;

    @Autowired
    public DatabaseLoader(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new CheckingAccount(12345, 67890, "Matthew", 10000.00));
        // use the instance variables from CheckingAccount class.
    }
}
