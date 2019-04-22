package com.masterclass.S7;

public class PrinterTest {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(false);

        myPrinter.printPage(5);
        myPrinter.fillUpToner(50);
        myPrinter.printPage(5);

        System.out.println(myPrinter.getTonerLevel());
    }
}
