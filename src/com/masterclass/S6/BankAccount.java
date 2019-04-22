package com.masterclass.S6;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double value){
        this.balance+=value;
        System.out.println("Saldo: "+this.balance);
    }

    public void withDraw(double value){
        if(value>this.balance){
            System.out.println("não há saldo suficiente");
            System.out.println("Saldo: "+this.balance);

        }else{
            this.balance -= value;
            System.out.println("Saldo: "+this.balance);
        }
    }
}
