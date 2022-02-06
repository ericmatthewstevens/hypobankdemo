package com.hypobank.hypobankdemo.AccountObjects;

import java.beans.JavaBean;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@JavaBean
@Entity
//@Table(name = "CHECKING_ACCOUNT")
    // Only uncomment @Table when the database with the same is created.
public class CheckingAccount {
    /**
     * Below are the instance variables that are needed in order to 
     * define a basic checking account. 
     * The @Column annotations are used to correspond with the database being used to 
     * store the data retreived from any declared CheckingAccount object.
     */

    private @Id @GeneratedValue Integer id; 

    @Column(name = "ACCOUNT_NUMBER")
    private int accountNumber;

    @Column(name = "ROUTING_NUMBER")
    private int routingNumber;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "BALANCE")
    private double balance;
    // Our Primary Key for our CheckingAccount class, that is being stored in our CHECKING_ACCOUNT database,
    // is now being stored in the instance variable "id".

    public CheckingAccount(int accountNumber, int routingNumber, String clientName, double balance) {
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.clientName = clientName;
        this.balance = balance;
    }

    /*
    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(id, employee.id) &&
			Objects.equals(firstName, employee.firstName) &&
			Objects.equals(lastName, employee.lastName) &&
			Objects.equals(description, employee.description);
	}
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckingAccount account = (CheckingAccount) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(accountNumber, account.accountNumber) &&
                Objects.equals(routingNumber, account.routingNumber) &&
                Objects.equals(clientName, account.clientName) &&
                Objects.equals(balance, account.balance);
    }

    /*@Override
	public int hashCode() {

		return Objects.hash(id, firstName, lastName, description);
    }*/
    
    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber, routingNumber, clientName, balance);
    }

    /*public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getRoutingNumber() {
        return this.routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Checking Account{" +
                "id: " + id +
                "Client Name: " + clientName + "\'" +
                "Balance: " + balance + "\'" +
                "Account Number: " + accountNumber + "\'" +
                "Routing Number: " + routingNumber + "\'" +
                "}";
    }

}
