package Teste1;

public class DecimalComparator {

    public static void main(String[] args) {

        boolean resultado = areEqualByThreeDecimalPlaces(-3.1756,-3.176);

        System.out.println(resultado);

    }



    public static boolean areEqualByThreeDecimalPlaces (double one, double two){
        double a = one*1000;
        double b = two*1000;

        int a1 = (int)a;
        int b1 = (int)b;

        if(a1==b1){
            return true;
        }

        return false;
    }
}
