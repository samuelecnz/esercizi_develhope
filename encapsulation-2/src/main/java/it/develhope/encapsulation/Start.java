package it.develhope.encapsulation;


import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Person person = new Person();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci nome: ");
        String name = scanner.nextLine();
        person.setName(name);

        System.out.println("Inserisci cognome: ");
        String surname = scanner.nextLine();
        person.setSurname(surname);

        System.out.println("Inserisci altezza: ");
        double height = scanner.nextDouble();
        person.setHeight(height);

        System.out.println("Inserisci eta': ");
        int age = scanner.nextInt();
        person.setAge(age);

        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Height: " + String.format("%.2f", person.getHeight()));
        System.out.println("Age: " + person.getAge());


    }
}
