package com.masterclass.S6;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle carro1 = new Vehicle("Gas",4);
        carro1.moving(100);

        CarModel carro2 = new CarModel("Diesel","Ford",
                "Mustang",1979,false);
        System.out.println("Fuel Type: "+carro2.getFuelType());
        System.out.println("Rodas: "+carro2.getWheels());
        carro2.moving(120);
    }



}
