package com.masterclass.S8;

import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts items.");
        System.out.println("\t 2 - To add an item to the contacts.");
        System.out.println("\t 3 - To modify an item in the contacts.");
        System.out.println("\t 4 - To remove an item from the contacts.");
        System.out.println("\t 5 - To search for an item in the contacts.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact(){
        System.out.println("Informe o novo contato: ");
        String novoContato = scanner.nextLine();
        if (contacts.onFile(novoContato)){
            System.out.println(novoContato+" já existe!");
            contacts.printContacts();
        }else {
            contacts.addContact(novoContato);
            System.out.println(novoContato+" adicionado na lista!");
            contacts.printContacts();
        }

    }

    public static void modifyContact(){
        System.out.println("Informe o contato a ser alterado: ");
        String contatoAntigo = scanner.nextLine();
        if(!contacts.onFile(contatoAntigo)){
            System.out.println(contatoAntigo+" não existe na lista!");
            contacts.printContacts();
        }else {
            System.out.println("Informe o novo contato: ");
            String novoContato = scanner.nextLine();
            contacts.modifyContact(contatoAntigo, novoContato);
            System.out.println("O contato foi alterado!");
            contacts.printContacts();
        }

    }

    public static void removeContact(){
        System.out.println("Informe o contato a ser removido: ");
        String contatoRemovido = scanner.nextLine();
        contacts.removeContact(contatoRemovido);
        System.out.println("O contato foi removidor!");
        contacts.printContacts();
    }

    public static void searchForContact(){
        System.out.println("Buscar o contato: ");
        String contatoBuscar = scanner.nextLine();
        if(contacts.onFile(contatoBuscar)){
            System.out.println("Contato localizado: "+contatoBuscar);
        }else {
            System.out.println(contatoBuscar+" não localizado");
        }
    }


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Saindo do sistema!");
                    break;

            }
        }


    }


}
