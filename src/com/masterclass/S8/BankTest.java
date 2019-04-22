package com.masterclass.S8;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank("Banco do Brasil");
        bank.addBranch("Fortaleza");
        bank.addCustomer("Fortaleza","Hercules",100);
        bank.addCustomer("Fortaleza","Nilzete",500);

        bank.listCustomers("Fortaleza",false);
        bank.addCustomerTransaction("Fortaleza","Nilzete",-100);
        bank.listCustomers("Fortaleza",true);

    }
}
