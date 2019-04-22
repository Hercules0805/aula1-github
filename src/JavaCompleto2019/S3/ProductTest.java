package JavaCompleto2019.S3;

import java.util.Locale;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Product p = new Product();

        System.out.println("Enter the Procutc Data:");
        System.out.print("Name: ");
        p.setName(sc.nextLine());
        System.out.print("Price: ");
        p.setPrice(sc.nextDouble());
        System.out.print("Quantity in Stock: ");
        p.setQuantity(sc.nextInt());

        p.totalValueStok();


        System.out.println("Produc Data: "+p.toString());

        System.out.print("Enter the number of Products to be add in the stock: ");
        p.addProducts(sc.nextInt());
        System.out.println("Updated data: " + p.toString());


        System.out.print("Enter the number of Products to be removed in the stock: ");
        p.removeProducts(sc.nextInt());
        System.out.println("Updated data: " + p.toString());


    }
}
