package com.hypobank.hypobankdemo.Repository;

import com.hypobank.hypobankdemo.AccountObjects.CheckingAccount;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<CheckingAccount, Long> {

    
}
