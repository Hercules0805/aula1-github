package com.masterclass.S5;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasLastDigit(541,12,13));
    }

    public static boolean hasLastDigit(int n1, int n2, int n3){

        if(isValid(n1) && isValid(n2 ) && isValid(n3)){
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            int dig3= n3 %10;

            if( (dig1==dig2) ||
                    (dig1==dig3) ||
                    (dig2==dig3)
            ) {
                return true;
            }else {
                return false;
            }

        }

        return false;


    }

    public static boolean isValid(int a){
        if( (a>=10 && a<=1000) ){
            return true;
        }
        return false;

    }
}
