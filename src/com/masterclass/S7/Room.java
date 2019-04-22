package com.masterclass.S7;

public class Room {
    private TV tv;
    private Bed bed;
    private Roof roof;
    private Wall wall;

    public Room(TV tv, Bed bed, Roof roof) {
        this.tv = tv;
        this.bed = bed;
        this.roof = roof;
    }

    public void makeBed(){
        bed.arrumarACama();
    }

    public TV getTv() {
        return tv;
    }

    public Bed getBed() {
        return bed;
    }

    public Roof getRoof() {
        return roof;
    }

    public Wall getWall() {
        return wall;
    }
}
