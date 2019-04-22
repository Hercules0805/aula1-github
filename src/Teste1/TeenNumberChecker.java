package Teste1;

public class TeenNumberChecker {

    public static void main(String[] args) {
        boolean resultadoHasTeen = hasTeen(22,23,34);
        System.out.println(resultadoHasTeen);

        boolean resultadoIsTeen = isTeen(15);
        System.out.println(resultadoIsTeen);

    }



    public static boolean hasTeen(int n1, int n2, int n3){
        if(n1>=13 && n1<=19 || n2>=13 && n2<=19 || n3>=13 && n3<=19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int n1){
        if(n1>=13 && n1<=19 ){
            return true;
        }

        return false;
    }
}
