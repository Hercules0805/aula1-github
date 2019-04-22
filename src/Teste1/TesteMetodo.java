package Teste1;

public class TesteMetodo {

    public static void main(String[] args) {
//        System.out.println(multiplicaNumeros(2,3));
//        System.out.println(somaNumeros(2,3));

        int resultMultiplica = multiplicaNumeros(2,3);
        System.out.println(resultMultiplica);
    }



    public static int multiplicaNumeros(int num1, int num2){
        int resultado = num1*num2;
        return resultado;
    }

    public static int somaNumeros(int num1, int num2){
        int resultado = num1+num2;
        return resultado;
    }

//    public static void resultadoTotal(){
//        System.out.println(multiplicaNumeros());
//    }
}
