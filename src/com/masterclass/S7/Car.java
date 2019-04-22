package com.masterclass.S7;



public class Car {
    private String name;
    private int cylinders;
    private boolean motorLigado;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.motorLigado = false;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        if(motorLigado){
            this.motorLigado =false;
            System.out.println("O motor foi desligado!");
        }else {
            this.motorLigado =true;
            System.out.println("Motor foi ligado...");
        }

    }

    public void acelerateCar(int speed){
        this.speed+=speed;
        System.out.println("Acelerando o carro para: "+this.speed+" Km/h");
    }

    public void breakCar(){
        this.speed-=5;
        if(this.speed<=0){
            this.speed= 0;
            System.out.println("Freando o carro até parar...");
        }else {
            System.out.println("Freando o carro, nova velocidade: "+this.speed+" Km/h");
        }

    }
}
