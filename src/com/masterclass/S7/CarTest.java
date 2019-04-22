package com.masterclass.S7;


public class CarTest {
    public static void main(String[] args) {
        Car carro = new Car("fusca",4);
//
//        carro.startEngine();
//        carro.acelerateCar(10);
//        carro.breakCar();
//        carro.breakCar();
//        carro.startEngine();

        Fusca fusca = new Fusca("sl 1200",1979);

        fusca.startEngine();
        fusca.acelerateCar(10);
        fusca.acelerateCar(10);
        fusca.startEngine();


    }
}
