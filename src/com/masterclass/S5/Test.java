package com.masterclass.S5;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int couner = 1;
        double sum = 0;
        double avg = 0;

        while (true){
            System.out.println("Digite o numero da posicao: "+ couner);

            if (couner<=3){
                sum += scanner.nextInt();
                avg = sum/couner;
                couner++;

            }else {
                break;
            }
            scanner.nextLine(); // handle input
        }



        System.out.println("sum: "+sum+" avg: "+Math.round(avg));


        scanner.close();
    }
}
