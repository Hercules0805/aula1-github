package JavaCompleto2019.S3;

import java.util.Locale;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.setName(sc.nextLine());
        System.out.print("First Result: ");
        student.setFirstTri(sc.nextDouble());
        System.out.print("Second Result: ");
        student.setSecontTri(sc.nextDouble());
        System.out.print("Third Result: ");
        student.setThirdTri(sc.nextDouble());

        System.out.println("");
        student.finalGrade();
    }
}
