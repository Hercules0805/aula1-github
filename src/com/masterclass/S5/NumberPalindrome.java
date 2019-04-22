package com.masterclass.S5;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-3888883));
    }

    public static boolean isPalindrome(int number){

        int numberOriginal = number;
        int reverse =0;

        if(number<0){
            number = number * (-1);
            numberOriginal = number;
        }

        while (number>0){
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }

        return (numberOriginal==reverse);


    }
}
