package Teste1;

public class EqualSumChecker {

    public static void main(String[] args) {

        boolean resultado = hasEqualSum(1,-1,0);
        System.out.println(resultado);

    }


    public static boolean hasEqualSum(int n1, int n2, int n3){

        int result1 = n1+n2;
        if (result1==n3){
            return true;
        }else {
            return  false;
        }


    }
}
