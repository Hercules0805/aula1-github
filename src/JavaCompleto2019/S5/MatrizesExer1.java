package JavaCompleto2019.S5;

import java.util.Scanner;

public class MatrizesExer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Montar a matriz
        System.out.print("Tamanho da Matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                 mat[i][j] = sc.nextInt();

            }
        }


        //Mostrar a Matriz
        System.out.println("Matriz:");
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Posiçao "+i+j+" : "+mat[i][j]);
            }
        }
        System.out.println("=========");

        //Mostrar diagonal principal
        System.out.println("Diagonal Principal:");
        for (int i = 0; i<mat.length; i++){
            System.out.println("Posiçao "+i+i+" : "+mat[i][i]);
        }
        System.out.println("=========");

        //Contar negativos
        System.out.println("Numeros Negativos:");
        int count = 0;
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]<0){
                    System.out.println("Numero negativo encontrado na posição "+i+j+" : "+mat[i][j]);
                    count ++;

                }
             }
        }
        System.out.println("Total de numeros negativos: "+count);


        sc.close();
    }
}
