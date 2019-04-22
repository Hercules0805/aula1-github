package com.masterclass.S4;

public class DayOfWeek {

    public static void main(String[] args) {

        printDayOfWeek(8);
        printDayOfWeek2(1);
    }

    public static void printDayOfWeek(int day){
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Mondey");
                break;
            case 3:
                System.out.println("Thusday");
                break;
            case 4:
                System.out.println("Wendnasday");
                break;
            case 5:
                System.out.println("Trursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
             default:
                 System.out.println("Invalid Day");
                 break;
        }
    }

    public static void printDayOfWeek2(int day){
        if(day<1 || day>7){
            System.out.println("Invalid Day");
        }
        else {
            if (day == 1) {
                System.out.println("Sunday");
            } else {
                if (day == 2) {
                    System.out.println("Monday");
                } else {
                    if (day == 3) {
                        System.out.println("Thusday");
                    }
                }

            }
        }
    }
}
