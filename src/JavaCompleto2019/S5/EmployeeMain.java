package JavaCompleto2019.S5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employees> list = new ArrayList<>();

        // PART 1 - READING DATA:

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + ":");
            System.out.print("Id : ");
            int id = sc.nextInt();
            System.out.print("Name : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary : ");
            double salary = sc.nextDouble();
            sc.nextLine();

            list.add(new Employees(id, name, salary));

        }
        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:


        System.out.println(
                "Enter the employee id that will " +
                        "have salary increase: ");
        int id = sc.nextInt();
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");

        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);

        }


        // PART 3 - LISTING EMPLOYEES:
        System.out.println("=========");
        System.out.println("Employees List: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));


            sc.close();


        }
    }

}
