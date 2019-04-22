package com.masterclass.S7;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(boolean duplexPrinter) {
        this.tonerLevel = 0;
        this.pagesPrinted = 0;
        this.duplexPrinter =duplexPrinter;
    }

    public void fillUpToner(int quantity){
        if (quantity>100){
            tonerLevel = 100;
            System.out.println("Novo Nível do Tonner: "+tonerLevel+"%");
        }else {
            tonerLevel+= quantity;
            System.out.println("Novo Nível do Tonner: "+tonerLevel+"%");
        }
        if(tonerLevel>100){
            tonerLevel=100;
            System.out.println("Novo Nível do Tonner: "+tonerLevel+"%");
        }
    }

    public void printPage(int numberOfPages){
        if(tonerLevel<numberOfPages){
            System.out.println("Toner abaixo da capacidade");
            System.out.println("Nível do Toner: "+tonerLevel+ "%");
        }else {
            System.out.println("Páginas enviadas para impressão: "+numberOfPages);
            pagesPrinted+=numberOfPages;
            System.out.println("Total de páginas já impressas: "+pagesPrinted+" páginas");
            tonerLevel-=numberOfPages;
        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
