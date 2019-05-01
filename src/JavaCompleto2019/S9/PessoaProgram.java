package JavaCompleto2019.S9;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PessoaProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> listPessoa = new ArrayList<>();

        System.out.print("Enter the number of tax payers:");
        int numberOfPayers = sc.nextInt();
        for (int i = 1; i <= numberOfPayers; i++) {
            System.out.println("Tax payer #" + i + " data:");
            sc.nextLine();
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double exp = sc.nextDouble();
                listPessoa.add(new PessoaFisica(name, income, exp));
            } else {
                System.out.print("Number of employees: ");
                int employess = sc.nextInt();
                listPessoa.add(new PessoaJuridica(name, income, employess));
            }
        }

        System.out.println("---------");
        System.out.println("TAXES PAID:");
        double sum = 0;
        for (Pessoa p : listPessoa) {
            System.out.println(p.getNome()
                    + ": $ "
                    + String.format("%.2f", p.calculaImposto()));
            sum += p.calculaImposto();
        }

        System.out.println("--------");
        System.out.print("TOTAL TAXES: $ "
                + String.format("%.2f", sum));
    }
}
