package it.develhope.polymorphism;

class Tester {
    public static void main(String[] args) {

        Animal animal = new Animal("Animale generico");
        Lion lion = new Lion("Simba");
        Cow cow = new Cow("Bessie");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}
