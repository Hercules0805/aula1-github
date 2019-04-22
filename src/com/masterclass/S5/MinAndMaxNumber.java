package com.masterclass.S5;

import java.util.Scanner;

public class MinAndMaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber=999999;
        int maxNuber=0;
        int counter = 0;

//

        while (counter<5){
            System.out.println("Digite um numero: ");
            int number = scanner.nextInt();


            if(number>maxNuber){
                maxNuber = number;
                counter++;
            }
            if(number<minNumber){
                minNumber = number;
                counter++;
            }



            scanner.nextLine();


        }

        System.out.println("Menor Numero digitado: "+minNumber);
        System.out.println("Maior Numero digitado: "+maxNuber);
        scanner.close();



    }
}
