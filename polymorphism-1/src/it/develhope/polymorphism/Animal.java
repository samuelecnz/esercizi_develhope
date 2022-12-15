package it.develhope.polymorphism;

public class Animal {
    public String animalName;
    public Animal(String name) {
        this.animalName = name;
    }

    public void animalSound() {
        System.out.println("Il leone sta ruggendo!");
    }

    public void animalSound(String intensity) {

        if (intensity.equals("high")) {
            System.out.println("Il leone ruggisce forte!");
        }
        else if (intensity.equals("low")) {
            System.out.println("Il leone ruggisce piano");
        }
        else {
            System.out.println("Il leone non ruggisce");
        }
    }
}
