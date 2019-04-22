package com.masterclass.S5;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    public static int getLargestPrime(int number){
        if((number<=1)){
            return -1;
        }

        return number;


    }

    public static int isPrime(int number){
        if((number<=1)){
            return -1;
        }

        if((number % 2 !=0)){
            return number;
        }

        return -1;
    }
}
