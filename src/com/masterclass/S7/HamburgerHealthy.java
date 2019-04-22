package com.masterclass.S7;

public class HamburgerHealthy extends Hamburger {
   private String name;
    private double priceRicota=1;
    private double finalPrice;

    public HamburgerHealthy(String meat, double price, String name) {
        super("brown rye", meat, price);
        this.name = name;
    }

//    @Override
//    public void addItem(boolean lettuce, boolean tomato) {
//        super.addItem(lettuce, tomato);
//
//
//    }


    @Override
    public void addLettuce() {
        super.addLettuce();
    }

    @Override
    public void addTomato() {
        super.addTomato();
    }

    public void addRicota(){
        double atualPrice = super.getPrice();
        atualPrice += priceRicota;
        System.out.println("Ricota foi adicionado por R$ "+getPriceRicota());
        System.out.println("Valor Total do Hamburger: R$ "+atualPrice);
    }

    @Override
    public String getName() {
        return name;
    }

    public double getPriceRicota() {
        return priceRicota;
    }

    @Override
    public double getFinalPrice() {
        return finalPrice;
    }
}
