package com.masterclass.S7;

public class Hamburger2 {
    private String breadType;
    private String meat;

    private boolean lettuce;
    private  boolean tomato;
    private boolean carrot;
    private boolean cheese;

    private double priceSimpleBurger=10;
    private double priceLettuce=1;
    private double priceTomato=2;
    private double priceCaroot=1;
    private double priceCheese=3;
    private double finalPrice=0;

    public Hamburger2(String breadType, String meat, boolean lettuce, boolean tomato, boolean carrot, boolean cheese) {

        this.breadType = breadType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.cheese = cheese;
    }

    public void calculateFinalPrice(){
        if(lettuce){
            finalPrice+=priceLettuce;
        }
        if(tomato){
            finalPrice+=priceTomato;
        }

        System.out.println("Valor do Hamburger2: R$ "+getPriceSimpleBurger()+getFinalPrice());
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isCheese() {
        return cheese;
    }

    public double getPriceSimpleBurger() {
        return priceSimpleBurger;
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
}
