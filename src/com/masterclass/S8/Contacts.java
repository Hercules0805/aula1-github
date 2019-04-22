package com.masterclass.S8;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contacts = new ArrayList<String>();

    public void addContact(String item){
        contacts.add(item);
    }

    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void printContacts(){
        System.out.println("Voce tem "+contacts.size()+" contatos na sua agenda");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i+1+"- "+contacts.get(i));
        }
    }

    private int findContactInterno(String item){
        return contacts.indexOf(item);
    }

    private void modifyContactInterno(int postion, String newItem){
        contacts.set(postion,newItem);
        //System.out.println("item "+ (postion+1) +" da agenda, foi modificado!");
    }

    public void modifyContact(String itemAntigo, String newItem){
        int position = findContactInterno(itemAntigo);
        if(position>=0){
            modifyContactInterno(position, newItem);
        }
    }

    private void removeContacInterno(int position){
        contacts.remove(position);
    }

    public void removeContact(String item){
        int position = findContactInterno(item);
        if(position>=0){
            removeContacInterno(position);
            System.out.println("Contato removido!");
        }

    }

    public boolean onFile(String item){
        int position = findContactInterno(item);
        if(position>=0){
            return true;
        }

        return false;
    }
}
