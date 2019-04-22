package com.masterclass.S5;

import java.util.Scanner;

public class InputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int soma = 0;



                for (int i=1; i<=10; i++){
                    System.out.println("Digite o numero #"+i+": ");
                    boolean isAnInt = scanner.hasNextInt();
                    if(isAnInt){
                        soma += scanner.nextInt();
                    }else {
                        System.out.println("Numero Invalido!");
                    }
                    scanner.nextLine();
                }



        System.out.println("A soma dos numeros digitados é: "+soma);

        scanner.close();
    }
}
