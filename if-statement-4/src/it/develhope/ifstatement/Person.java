package it.develhope.ifstatement;

public class Person {
    public int age;

    public Person() {
        int min = 5;
        int max = 80;
        this.age = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Age: " + this.age);
    }
    public String getLifeStage() {

        if (this.age <= 12) {
            return "Bambino";
        } else if (this.age >= 13 && this.age <= 23) {
            return "Ragazzo";
        } else if (this.age >= 23 && this.age <= 60) {
            return "Adulto";
        } else {
            return "Anziano";
        }
    }
}

        