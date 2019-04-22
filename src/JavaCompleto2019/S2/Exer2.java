package JavaCompleto2019.S2;

import java.util.Locale;
import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = sc.nextLine();
        System.out.println("How many bedrooms are in the house?");
        int badroom = sc.nextInt();
        System.out.println("Enter the product price");
        double price = sc.nextDouble();

        System.out.println("Enter your last name, age and height in the same line");
        String lastname = sc.next();
        int age = sc.nextInt();
        double height = sc.nextDouble();



        System.out.println(fullName);
        System.out.println(badroom);
        System.out.println(price);
        System.out.println(lastname);
        System.out.println(age);
        System.out.println(height);


        sc.close();
    }
}
