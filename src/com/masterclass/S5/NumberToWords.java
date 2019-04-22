package com.masterclass.S5;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(13);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digit = getDigitCount(number);
        number = reverse(number);
        int num = 0;
        do {
            switch (number % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;


            }
            num++;
            number /= 10;


        }
        while (number != 0);
        if (digit != num){
            int rem = digit - num;
            for (int i = 1; i <= rem; i++){
                System.out.println("Zero");
            }
        }



    }

    public static int reverse(int x) {
        int num = 0;
        while (x != 0) {
            num *= 10;
            num += x % 10;
            x /= 10;
        }
        return num;
    }

    public static int getDigitCount(int y) {
        if (y < 0) {
            return -1;
        }
        int digit = 0;
        do {
            digit++;
            y /= 10;
        }

        while (y != 0);
        return digit;
    }
}
