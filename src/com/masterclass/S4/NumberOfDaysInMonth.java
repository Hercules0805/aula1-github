package com.masterclass.S4;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        //System.out.println(isLeapYear(1998));

        System.out.println(getDaysInMonth(-1,-2020));
    }

    public static boolean isLeapYear(int year){
        if(year<1 && year>9999){
            return false;
        }else {
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                return true;
            }
            else {
                return false;
            }
        }


    }

    public static int getDaysInMonth(int month, int year){
        if((month<1 || month>12) || (year<1 || year>9999)){
            return -1;
        }else {
            switch (month){
                case 1:
                    int days = 31;
                    return days;

                case 2:
                    if (isLeapYear(year)){
                        days = 29;
                        return days;
                    }else {
                        days = 28;
                        return days;
                    }




            }
        }

        return 1;
    }
}
