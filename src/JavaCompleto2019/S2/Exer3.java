package JavaCompleto2019.S2;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int numero;
       int higher = 0;
//
//        for (int i = 1; i<=3; i++){
//            System.out.println("Digite o numero: "+i);
//            numero = scanner.nextInt();
//            if(numero>higher){
//                higher = numero;
//            }
//
//        }
//        System.out.println("Maior numero: " + higher);

        System.out.println("Digite 3 numeros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if((num1>num2) && (num1>num3)){
            higher=num1;
        } else if (num2>num3){
            higher = num2;
        }else {
           higher = num3;
        }

        System.out.println("Higher: "+higher);

    }
}
