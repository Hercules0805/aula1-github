package com.masterclass.S5;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
        long avg = 0;


        while (true){

            System.out.println("Digite o numero da sposiçao : "+counter);
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
              sum += scanner.nextInt();
              avg = (long) (sum/counter);
              counter++;
            }else {
                break;
            }



            scanner.nextLine(); // handle input
        }
        System.out.println("SUM: "+Math.round(sum)+" AVG: "+Math.round(avg));

        scanner.close();


    }
}
