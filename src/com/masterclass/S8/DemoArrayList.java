package com.masterclass.S8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);


//        for (int i = 0; i < listInteger.size(); i++) {
//            System.out.println(i +" : "+listInteger.get(i));
//        }
//
//        listInteger.add(1,5);
//        for (int i = 0; i < listInteger.size(); i++) {
//            System.out.println(i +" : "+listInteger.get(i));
//        }

        ArrayList<String> placesToVisit = new ArrayList<>();
        placesToVisit.add("Tamboril");
        placesToVisit.add("Sucesso");
        placesToVisit.add("Crateus");

        LinkedList<String> buildsToVist = new LinkedList<>();
        buildsToVist.add("EmpireState");
        buildsToVist.add("TQuixada");
        buildsToVist.add("Copan");

//        printPlaces(placesToVisit);
//        printBuilds(buildsToVist);
//
//        placesToVisit.add(1,"Nova Russas");
//        printPlaces(placesToVisit);

        forPrintBuilds(buildsToVist);
        forPrintPlaces(placesToVisit);

        buildsToVist.add(1,"MAC");
        placesToVisit.add(1,"Nova Russas");
        forPrintBuilds(buildsToVist);
        forPrintPlaces(placesToVisit);




    }

    private static void printBuilds(LinkedList<String> buildsToVist){
        Iterator<String> i = buildsToVist.iterator();
        while (i.hasNext()){
            System.out.println(1+" :Visitando o Predio: "+ i.next());
        }
        System.out.println("================================");
    }

    private static void printPlaces (ArrayList<String> placesToVisit){
        Iterator<String> i = placesToVisit.iterator();
        while (i.hasNext()){
            System.out.println(i+" :Visitando a cidade: "+i.next());
        }
        System.out.println("================================");
    }

    private static void forPrintBuilds(LinkedList<String> buildsToVist){
        for (int i = 0; i < buildsToVist.size(); i++) {
            System.out.println(i+" : Visitando o predio: "+buildsToVist.get(i));

        }
        System.out.println("================================");
    }

    private static void forPrintPlaces(ArrayList<String> placesToVisit){
        for (int i = 0; i < placesToVisit.size(); i++) {
            System.out.println(i+" : Visitando a cidade: "+placesToVisit.get(i));

        }
        System.out.println("================================");
    }
}
