package com.masterclass.S6;

public class CarModel extends Car {
    private String model;
    private int year;
    private boolean automatic;

    public CarModel(String fuelType, String factory, String model, int year, boolean automatic) {
        super(fuelType, factory);
        this.model = model;
        this.year = year;
        this.automatic = automatic;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }
}
