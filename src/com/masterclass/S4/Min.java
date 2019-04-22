package com.masterclass.S4;

public class Min {

    public static void main(String[] args) {
        //String resultado = getDuratioString(123,40);
        System.out.println(getDuratioString(123,40));

        //String resultado = getDuratioString(123);
        System.out.println(getDuratioString(123));
    }

    public static String getDuratioString(int minutes, int seconds){
        if((minutes<0) || (seconds<0 || seconds>59)){
            return "Valor Invalido";
        }

        int hours = minutes / 60;
        int restMinuts = minutes % 60;

        return hours+"h "+restMinuts+"m "+seconds+"s";
    }

    public static String getDuratioString(int seconds){
        if((seconds<0 || seconds<0)){
            return "Valor Invalido";
        }

        int minutes = seconds / 60;
        int restSeconds = seconds % 60;

        return minutes+"m "+restSeconds+"s";
    }

}
