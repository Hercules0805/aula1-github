package com.masterclass.S6;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount conta1 = new BankAccount();

        conta1.depositFunds(100);
        conta1.getBalance();
        conta1.withDraw(75);
        conta1.withDraw(30);
    }
}
