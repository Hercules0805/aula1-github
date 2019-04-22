package JavaCompleto2019.S4;

import java.util.Locale;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double deposit;
        double withdraw;


        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        Account account = new Account(number,holder);

        System.out.print("Is there na initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);

        if(resposta == 'y'){
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            account.fazerDeposito(deposit);
            sc.nextLine();
            System.out.println(account);
            System.out.println("================");
        }else {
            System.out.println(account);
        }

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        account.fazerDeposito(deposit);
        System.out.print("Updated account data: ");
        System.out.println(account);
        System.out.println("================");

        System.out.print("Enter a withdraw value: ");
        withdraw = sc.nextDouble();
        account.fazerSaque(withdraw);
        System.out.print("Updated account data: ");
        System.out.println(account);

        sc.close();
    }

}
