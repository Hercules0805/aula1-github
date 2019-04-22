package com.masterclass.S6;

public class Wall {
    private double width;
    private double height;
    private double area;

    public Wall(){

    }

    public Wall(double width, double height) {
        if (width<0){
            this.width = 0;

        }else {
            this.width = width;

        }

        if (height<0){
            this.height=0;
        }else {
            this.height=height;
        }

    }

    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width){
        if (width<0){
            this.width=0;
        }
        this.width=width;
    }

    public void setHeight(double height) {
        if(height<0){
            this.height=0;
        }else {
            this.height = height;
        }

    }

    public double getArea(){
        area = width*height;
        return area;
    }
}
