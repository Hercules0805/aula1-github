package JavaCompleto2019.S8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class OrderProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Recebendo os dados do Cliente
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date birth = sdf.parse(sc.next());

        //Instanciando um Cliente
        Client client = new Client(name,email,birth);

        // Recebendo os dados do pedido
        System.out.println("-------------");
        System.out.println("Enter order data:");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        sc.nextLine();
        System.out.print("How many items to this order? ");
        int items = sc.nextInt();

        //Instanciando um pedido
        Date date = new Date(System.currentTimeMillis());
        Order order = new Order(new Date(),status,client);


        // Recebendo os dados de um pedido
        for (int i = 1; i<=items; i++){
            System.out.println("Enter #"+i+" item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            //Instanciando um Produto
            Product product = new Product(productName,productPrice);

            //Recebendo a quantidade de Produtos
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();


            //Instanciando um OrderItem

            OrderItem orderItem = new OrderItem(quantity,productPrice,product);
            order.addItem(orderItem);

        }

        //Gerando o Order Sumary:
        System.out.println("-------------");
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);







    }
}
