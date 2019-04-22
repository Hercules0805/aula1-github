package JavaCompleto2019.S3;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.setName(scanner.nextLine());
        System.out.print("Gross Salary: ");
        employee.setGrossSalary(scanner.nextDouble());
        System.out.print("Tax: ");
        employee.setTax(scanner.nextDouble());

        System.out.println(employee);
        System.out.println("");

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(scanner.nextDouble());

        System.out.println("");
        System.out.println("Updatede data" + employee);




    }
}
