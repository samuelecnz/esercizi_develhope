package it.develhope.polymorphism;

public class Animal {
    private String animalName;
    public Animal(String name) {
        this.animalName = name;
    }
    public void animalSound() {
        System.out.println("L'animale fa un verso.");
    }
}
