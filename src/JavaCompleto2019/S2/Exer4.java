package JavaCompleto2019.S2;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {

        int valor = encontraMaior();
        mostraValor(valor);

    }

    public static int encontraMaior(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int qtdeNum = sc.nextInt();
        int maior=0;

        while(qtdeNum<=0){
            System.out.print("Valor invalido, tente novamente: ");
            qtdeNum = sc.nextInt();
        }
        for (int i=1; i<=qtdeNum; i++){

            System.out.print("Value #" + i + ": ");
            int valor = sc.nextInt();
            if(valor>maior){
                maior = valor;
            }

        }
        return maior;
    }

    public static void mostraValor(int valor){
        System.out.println("Valor encontrado: "+valor);
    }


}
