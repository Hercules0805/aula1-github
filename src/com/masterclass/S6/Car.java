package com.masterclass.S6;

public class Car extends Vehicle {
    private String factory;

    public Car(String fuelType, String factory) {
        super(fuelType, 4);
        this.factory = factory;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public void steering(){
        System.out.println("Dirigindo o carro...");
    }

    public void changeGears(){
        System.out.println("Trocando a marcha...");
    }
}
