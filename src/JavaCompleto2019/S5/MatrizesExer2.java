package JavaCompleto2019.S5;

import java.util.Scanner;

public class MatrizesExer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Receber as dimensões da matriz
        System.out.println("Digite as dimensões da Matriz");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        //Populando a Matriz
        System.out.println("Entre com os valores da matriz:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        //Mostrar a Matriz
        System.out.println("Matriz:");
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Posiçao "+i+","+j+" : "+mat[i][j]);
            }
        }
        System.out.println("=============");
        //Ler o numero X
        System.out.print("Digite o numero da Matriz: ");
        int x = sc.nextInt();

        //Localizar as ocorrencias de X
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]==x){
                    System.out.println(x+" localizado na posiçao: "+i+","+j);
                    if(j>0){
                        System.out.println("Esquerda: "+mat[i][j-1]);
                    }
                    if((j < mat[i].length-1)){
                        System.out.println("Direita: "+mat[i][j+1]);
                    }

                    if (i > 0){
                        System.out.println("Acima: "+mat[i-1][j]);
                    }
                    if (i < mat.length-1){
                        System.out.println("Abaixo: "+mat[i+1][j]);
                    }
                    System.out.println("===========");



                }
            }
        }


    }
}
