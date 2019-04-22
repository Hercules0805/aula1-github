package com.masterclass.S7;

public class Fusca extends Car {

    private String model;
    private int year;

    public Fusca( String model, int year) {
        super("Fusca", 4);
        this.model = model;
        this.year = year;
    }



    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void startEngine() {
        //super.startEngine();
        if (isMotorLigado()){
            super.setMotorLigado(false);
            System.out.println("Motor de Fusca desligado...");
        }else {
            super.setMotorLigado(true);
            System.out.println("Motor de Fusca ligado...");
        }

    }

    @Override
    public void acelerateCar(int speed) {
        //super.acelerateCar(speed);
        int newSpeed = (speed + super.getSpeed());
        super.setSpeed(newSpeed);
        System.out.println("Acelerando fusca para "+super.getSpeed()+" Km/h");
    }
}
