package JavaCompleto2019.S5;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room[] vect = new Room[10];

        System.out.print("How many rooms will be rented?  ");
        int n = sc.nextInt();


        for (int i=0; i<n; i++){
            sc.nextLine();
            System.out.println("Rent: # "+(i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room]= new Room(name,email);
        }

//        for(int i=0; i<vect.length; i++){
//            Room aux[i];
//            if(vect[i].getNumber()>vect[i+1].getNumber()){
//                aux[i] = vect[i];
//            }
//        }

        System.out.println("===========");
        System.out.println("Busy Rooms: ");
        for (int i=0; i<vect.length; i++)
            if(vect[i] != null){
                System.out.println(i+ ": " + vect[i]);
            }

        sc.close();


    }
}
