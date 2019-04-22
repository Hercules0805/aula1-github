package JavaCompleto2019.S3;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.setWidth(sc.nextDouble());
        rectangle.setHeight(sc.nextDouble());
        System.out.println(rectangle);


    }
}
