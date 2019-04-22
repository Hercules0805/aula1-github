package com.masterclass.S4;

public class DesafioFor {

    public static void main(String[] args) {

        int contador = 0;
        int resultado = 0;


        for (int i=1; i<=1000 ; i++){

            if((i % 3 == 0) && (i % 5==0)){
                System.out.println("Numero encontrado: "+i);
                resultado += i;
                contador++;

                if(contador>4){
                    break;

                }

            }

        }

            System.out.println("soma encontrada: "+resultado);
    }
}
