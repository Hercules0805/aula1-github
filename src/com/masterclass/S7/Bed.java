package com.masterclass.S7;

public class Bed {
    private int width;
    private int length;
    private int height;

    public Bed(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void arrumarACama(){
        System.out.println("Arrumando a cama...");
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
