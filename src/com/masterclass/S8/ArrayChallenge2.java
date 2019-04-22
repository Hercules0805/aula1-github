package com.masterclass.S8;

import java.util.Scanner;

public class ArrayChallenge2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //printArray(readIntegers(3));

        int[] myArray = readIntegers(3);
        findMin(myArray);
        printArray(myArray);



    }


    public static int[] readIntegers(int count){


        int[] array = new int[count];
        System.out.println("O array conterá "+count+" numeros \r");
        for (int i=0;i<array.length;i++){
            System.out.println("Digite o numero da posiçao "+i);
            array[i]=scanner.nextInt();
        }

        return array;

    }

    public static void findMin(int[] array){
        int min=Integer.MAX_VALUE;


        for (int i=0; i<array.length; i++){
            int value = array[i];
            if (value<min){
                min=value;
            }
        }

        System.out.println("Menor valor: "+min);

    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length; i++)
            System.out.println("Posiçao: "+i+", valor: "+array[i]);
    }
}
