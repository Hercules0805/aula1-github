package com.masterclass.S8;

public class ContactTest {
    public static void main(String[] args) {

        Contacts contacts = new Contacts();
        contacts.addContact("hercules");
        contacts.printContacts();
        contacts.modifyContact("hercules","oliveira");
        contacts.printContacts();
    }



}
