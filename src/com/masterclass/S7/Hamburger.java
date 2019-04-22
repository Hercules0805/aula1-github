package com.masterclass.S7;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private double price;

    private double priceLettuce=1;
    private double priceTomato=2;
    private double priceCaroot=1;
    private double priceCheese=3;
    private double finalPrice=0;

    public Hamburger(String rollType, String meat, double price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }


    public void addLettuce(){
        this.price += priceLettuce;
        System.out.println("Alface foi adicionado por R$ "+getPriceLettuce());
        System.out.println("Valor Total do Hamburger: R$ "+getPrice());

    }

    public void addTomato(){
        this.price += priceTomato;
        System.out.println("Tomate foi adicionado por R$ "+getPriceTomato());
        System.out.println("Valor Total do Hamburger: R$ "+getPrice());

    }



    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceLettuce() {
        return priceLettuce;
    }

    public double getPriceTomato() {
        return priceTomato;
    }

    public double getPriceCaroot() {
        return priceCaroot;
    }

    public double getPriceCheese() {
        return priceCheese;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
