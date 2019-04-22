package Teste1;

public class BarkingDog {


    public static void main(String[] args) {

        Boolean Result = sholdWakeUp(true, -1);
        System.out.println(Result);

    }

    public static boolean sholdWakeUp(boolean barking, int hourOfDay){

        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }else {

            if(barking==true && hourOfDay<8 || hourOfDay>22){
               return true;
            }else {
                return false;
            }

        }

    }
}
