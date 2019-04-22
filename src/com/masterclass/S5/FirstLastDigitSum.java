package com.masterclass.S5;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstLastDigit(5));

    }

    public static int sumFirstLastDigit(int number){

        int lastNumber = number % 10;
        int firstNumber = 0;

        if (number<0){
            return -1;
        }

        if(number<=9){
            lastNumber = number;
            firstNumber = number;
        } else {
            while (number>=10){

                int resto = number % 10;
                number = number / 10;
                firstNumber = number;

            }

        }


        return (lastNumber+firstNumber);
    }
}
