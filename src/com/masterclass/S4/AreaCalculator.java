package com.masterclass.S4;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5,4));
    }

    private static double area(double radius){
        if(radius<0){
            return -1;
        }
        radius = radius * radius * Math.PI;
        return radius;


    }

    private static double area(double x, double y){
        if((x<0) || (y<0)){
            return -1;
        }

        double rectangle = x*y;
        return rectangle;


    }
}
