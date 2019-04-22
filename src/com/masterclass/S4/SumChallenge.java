package com.masterclass.S4;

public class SumChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(111111111));



    }



    public static int sumDigits(int number){
        if(number>=10){

//            //Lógica sem While
//            int digOne = number % 10;
//            int restOne = number / 10;
//            int digTwo = restOne % 10;
//            int restTwo = restOne / 10;
//            int digTrhee = restTwo;
//            int result = digOne+digTwo+digTrhee;


            //Lógica com While
            int resto = number;
            int total = 0;

            while (resto>0){

                int digito = resto % 10;
                total+= digito;
                resto = resto / 10;

            }



            return total;


        }
        return -1;
    }
}
