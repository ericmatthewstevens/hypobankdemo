package com.hypobank.hypobankdemo.Functions;

import com.hypobank.hypobankdemo.AccountObjects.CheckingAccount;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class Operations {
    
      /**
   * First, write a method that intakes the amount from the main Bank Account class.
   * This method will then perform a deposit (transaction amount minus the account balance). 
   * This method will only take one parameter, the transaction amount.
   * 
   * First, the method will check whether or not it meets the requirements. Such as not letting the user deposit anything less than $1.
   * 
   * If the transaction amount meets these requirements, the transaction amount will be deposited in to the account.
   * 
   * First, the method will perform the following checklist:
   * 
   * * If the account balance after the transaction is less than or equal to $0, alert the user of the account balance.
   * 
   */

   private float transactionAmount;
   private float accountBalance;

   public float deposit(float transactionAmount, float accountBalance) {
       if (transactionAmount > 1) {
           accountBalance += transactionAmount;
           return accountBalance;
       } else {
           throw new
           ResponseStatusException(HttpStatus.BAD_REQUEST, "The Transaction Amount contained a non-numeric value.");
       }
   }
}
