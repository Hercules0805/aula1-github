package JavaCompleto2019.S3;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolarValue = sc.nextDouble();
        System.out.print("How many dollars do you want to buy? ");
        double dolarQuantity = sc.nextDouble();
        double valorEmReais =
                CurrencyConverter.dolarConverter(dolarValue,dolarQuantity);
        System.out.println("Amount to paid in Reais R$ "
                + String.format("%.2f",valorEmReais));




        sc.close();
    }
}
