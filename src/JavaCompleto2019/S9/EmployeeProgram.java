package JavaCompleto2019.S9;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> listEmployess = new ArrayList<>();

//        Employee e1 = new Employee("maria",10,5);
//        Employee e2 = new OutsourceEmployee("joao",10,5,50);
//
//        System.out.println(e1);
//        System.out.println("Payment: "+e1.payment());
//        System.out.println("-------------");
//        System.out.println(e2);
//        System.out.println("Payment: "+e2.payment());

        System.out.print("Enter the number of employees: ");
        int numberEmployees = sc.nextInt();
        for (int i = 1; i <= numberEmployees; i++) {
            System.out.println("Employee #"+i+" data:");
            System.out.print("Outsourced (y/n)?");
            char resp = sc.next().charAt(0);

            //Recebendo dados para Employee Outsourced
            if(resp=='y'){
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                sc.nextLine();
                System.out.print("Value per hour: ");
                double valueHour = sc.nextDouble();
                sc.nextLine();
                System.out.print("Additional charge: ");
                double adtionalValue = sc.nextDouble();
                sc.nextLine();

                //Instanciando Employee Outsourced
                Employee employee = new OutsourceEmployee(name,hours,valueHour,adtionalValue);
                listEmployess.add(employee);



            }else {
                //Recebendo dados para Employee Padão
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                sc.nextLine();
                System.out.print("Value per hour: ");
                double valueHour = sc.nextDouble();
                sc.nextLine();

                Employee employee = new Employee(name,hours,valueHour);
                listEmployess.add(employee);
            }
        }

        //Apresentando os pagamentos
        System.out.println("-----------");
        System.out.println("PAYMENTS:");
        for (Employee e :
                listEmployess) {
            System.out.println(e.getName() +" - $"+String.format("%.2f",e.payment()));
        }

    }
}
