package JavaCompleto2019.S10.model.entities;

import JavaCompleto2019.S10.model.exceptions.DomainException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }


    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Saldo atualizado: $ " + getBalance());
    }

    public void withdraw(double amount) {

        if (amount > withdrawLimit) {
            throw new DomainException("Limite de saque excedido");

        }

        if (amount > balance) {
            throw new DomainException("Não há saldo suficiente");

        }

        balance -= amount;
        System.out.println("Saldo atualizado: $ " + String.format("%.2f",getBalance()));
    }

    @Override
    public String toString() {
        return "Account :" + "\n"+
                "------" + "\n"+
                "number= " + number + "\n"+
                "holder= " + holder + "\n"+
                "balance= $ " + balance + "\n"+
                "withdrawLimit= $ " + withdrawLimit
                ;
    }
}
