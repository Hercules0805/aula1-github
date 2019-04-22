package com.masterclass.S7;

public class TV {
    private String model;
    private int inch;
    private boolean estaLigada;

    public TV(String model, int inch) {
        this.model = model;
        this.inch = inch;
        this.estaLigada = false;
    }

    public void ligarTV(){
        if(estaLigada==false){
            this.estaLigada = true;
            System.out.println("A TV foi ligada...");
        }else {
            this.estaLigada = false;
            System.out.println("A TV foi desligada...");
        }


    }

    public String getModel() {
        return model;
    }

    public int getInch() {
        return inch;
    }


}
