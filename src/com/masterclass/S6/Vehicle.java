package com.masterclass.S6;

public class Vehicle {
    private String fuelType;
    private int wheels;

    public Vehicle(String fuelType, int wheels) {
        this.fuelType = fuelType;
        this.wheels = wheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


    public void moving(int speed){
        System.out.println("Velocidade de: "+ speed+" Km/h");
    }

}
