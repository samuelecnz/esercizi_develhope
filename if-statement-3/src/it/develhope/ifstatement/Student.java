package it.develhope.ifstatement;

import java.util.Random;

    public class Student {
        private String name;
        private int age;

        public Student(String studentName, int studentAge) {
            name = studentName;
            age = studentAge;
        }

        public void guessingAge() {
            Random rand = new Random();
            int randomValue = rand.nextInt(35);

            System.out.println("Ho generato il numero random " + randomValue + " per lo studente " + name + ".");

            if (randomValue == age) {
                System.out.println("Il numero generato equivale all'eta' dello studente.");
            } else if (randomValue > age) {
                System.out.println("Il numero generato e' maggiore all'eta' dello studente.");
            } else {
                System.out.println("Il numero generato e' minore all'eta' dello studente.");
            }
        }
    }


