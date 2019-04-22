package com.masterclass.S4;

public class TestFor {

    public static void main(String[] args) {

        int total = 0;

        for (int i=1;i<4;i++){
            System.out.println(i);
            total += i;
        }

        System.out.println("total: "+total);


        /* for (int i=2; i<9 ;i++){
            System.out.println ("Interest rate: "+i+" : "+ calculateInterest(10000,i) ) ;

        } */


    }

    public static double calculateInterest (double amount, double interestRate){
        return (amount *(interestRate/100));
    }


}
