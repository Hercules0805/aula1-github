package com.masterclass.S6;

public class Calculator {
    Floor floor;
    Carpet carpete;

    public Calculator(Floor floor, Carpet carpete) {
        this.floor = floor;
        this.carpete = carpete;
    }

    public double getTotalCost(){
        double totalCost = floor.getArea() * carpete.getCost();
        return totalCost;
    }
}
