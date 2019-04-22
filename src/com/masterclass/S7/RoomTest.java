package com.masterclass.S7;

public class RoomTest {
    public static void main(String[] args) {
        TV tv1 = new TV("IOC",24);
        Bed cama = new Bed(1,2,1);
        Roof roof = new Roof(5,4);
        Room myRoom = new Room(tv1,cama,roof);

        myRoom.getTv().ligarTV();
        myRoom.getTv().ligarTV();
        myRoom.getTv().ligarTV();
        myRoom.getBed().arrumarACama();
        myRoom.makeBed();

    }
}
