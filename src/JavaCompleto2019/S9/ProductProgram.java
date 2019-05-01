package JavaCompleto2019.S9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProductProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> listProducts = new ArrayList<>();



        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();
        for (int i = 1; i <= numberProducts; i++) {
            System.out.println("Product #"+i+" data:");
            System.out.print("Common, used or imported (c/u/i)?");
            sc.nextLine();
            char ch = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            //Product product = new Product(name,price);

            switch (ch) {
                case 'c':
                    Product product = new Product(name, price);
                    listProducts.add(product);
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date date = spf.parse(sc.next());
                    Product product1 = new UsedProduct(name, price, date);
                    listProducts.add(product1);
                    break;
                case 'i':
                    System.out.print("Custom Fee: ");
                    double fee = sc.nextDouble();
                    Product product2 = new ImportedProduct(name, price, fee);
                    listProducts.add(product2);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }

        }

        //Mostrando os Produtos
        System.out.println("---------");
        System.out.println("PRICE TAGS:");
        for (Product p: listProducts) {
            System.out.println(p.priceTag());
        }
    }

}


