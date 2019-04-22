package com.masterclass.S6;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((double) (x*x+y*y));
    }

    public double distance(int x, int y){
        int a = x-this.x;
        int b = y-this.y;
        if (a<0) a *= -1;
        if (b<0) b *= -1;
        return Math.sqrt((double) (a*a+b*b));
    }

    public double distance(Point point) {
        return point.distance(x,y)-point.distance(point.getX(),point.getY());
    }


}
