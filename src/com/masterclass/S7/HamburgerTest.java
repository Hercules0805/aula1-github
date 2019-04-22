package com.masterclass.S7;

public class HamburgerTest {
    public static void main(String[] args) {
//        Hamburger2 hamburger = new Hamburger2("Bola","Gado",true,true,false,false);
//        hamburger.calculateFinalPrice();

        Hamburger hamburger = new Hamburger("ball bread","gado",10);
//        hamburger.addLettuce();
//        hamburger.addTomato();
//

        HamburgerHealthy hamburgerHealthy = new HamburgerHealthy("Frango",15,"Hamburger Saudavel");
        hamburgerHealthy.addLettuce();
        hamburgerHealthy.addRicota();


    }
}
