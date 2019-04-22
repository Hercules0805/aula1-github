package com.masterclass.S5;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo){



        if((numberOne<10 || numberOne>99) || (numberTwo<10 || numberTwo>99)) {
            return false;
        }

        int NumberOnedigOne = numberOne % 10;
        int NumberOnedigTwo = numberOne /10;
        int NumberTwoDigOne = numberTwo % 10;
        int NumberTwoDigTwo = numberTwo /10;

        if ( (NumberOnedigOne==NumberTwoDigOne) ||
             (NumberOnedigOne==NumberTwoDigTwo) ||
             (NumberOnedigTwo==NumberTwoDigOne) ||
             (NumberOnedigTwo==NumberTwoDigTwo)

        )
            return true;
        else {
            return false;
        }



    }
}
