package com.masterclass.S7;

public class HamburgerDeluxe extends Hamburger {
    private boolean drink;
    private boolean chips;

    public HamburgerDeluxe(String rollType, String meat, double price) {
        super(rollType, meat, price);
        this.drink = true;
        this.chips = true;
    }
}
