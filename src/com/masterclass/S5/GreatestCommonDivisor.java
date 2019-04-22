package com.masterclass.S5;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(10,20));


    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second <10){
            return -1;
        }
        else{
            int greatestCommonDivisor = 0;
            int lengthOfLoop = first > second ? second : first;
            for(int i = 1; i <= lengthOfLoop; i++){
                if((first % i == 0) && (second % i == 0)){
                    greatestCommonDivisor = i;
                }
            }
            return greatestCommonDivisor;
        }
    }

}
