package com.masterclass.S8;

public class ArrayChallengeReverse extends ArrayChallenge2 {

    public static void main(String[] args) {

        int[] myArray = readIntegers(5);
        printArray(myArray);
        printArray(reverseArray(myArray));

    }

    public static int[] reverseArray(int[] array){
       int[] newArray = new int[array.length];
       int lastArrayPosition=array.length-1;

       for (int i =0; i<array.length;i++){
           newArray[i]=array[lastArrayPosition];
           lastArrayPosition--;
       }

       return newArray;
    }

}
