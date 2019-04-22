package com.masterclass.S8;

import java.util.Scanner;

public class ArrayChalleng1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray  = getIntegers(3);
        printArray(myArray);
        sortIntegers(myArray);
        printArray(myArray);




    }

    public static int[] getIntegers(int tamanhoArray){
        System.out.println("Digite "+tamanhoArray+" numeros inteiros. \r");
        int[] values = new int[tamanhoArray];

        for (int i=0; i<values.length; i++){
            values[i]= scanner.nextInt();

        }

        return values;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Posicao: "+i+" valor: "+array[i]);

        }
    }

    public static void sortIntegers(int[] array){
        int aux=0;

        for(int i=0; i<array.length-1; i++){

            for (int j=0; j<array.length-1; j++)
                if(array[j]<array[j+1]){
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;

                }
        }

    }
}
