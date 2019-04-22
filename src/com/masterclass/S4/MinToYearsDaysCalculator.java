package com.masterclass.S4;

public class MinToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else {
            long years = minutes / 525600;
            long days = minutes / 1440 ;
            long restDays = days % 365;



            System.out.println(minutes+" min = "+years+" Y and "+ restDays+" d");
        }




    }
}
