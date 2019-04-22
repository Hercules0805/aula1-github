package com.masterclass.S6;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double lenght, double height) {
        super(width, lenght);
        if(height<0){
            this.height=0;
        }else {
            this.height = height;
        }

    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        double volume = super.getArea()*getHeight();
        return volume;
    }
}
