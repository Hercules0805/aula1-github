package JavaCompleto2019.S10.application;

import JavaCompleto2019.S10.model.entities.Account;
import JavaCompleto2019.S10.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Teste
//        try {
//            Account account = new Account(234,"Hercules",200);
//            account.deposit(500);
//            System.out.println(account);
//            System.out.println();
//            account.withdraw(100);
//        }
//        catch (DomainException e){
//            System.out.println("Erro: " + e.getMessage());
//        }

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        //Instanciando a conta
        Account account = new Account(number,holder,balance,withdrawLimit);
        System.out.println("--------");

        //Realizando saque
        try {
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());
        }
        catch (DomainException e){
            System.out.println("Error: "+e.getMessage());
        }





    }
}
