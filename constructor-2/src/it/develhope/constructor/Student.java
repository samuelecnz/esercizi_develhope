package it.develhope.constructor;

public class Student {
    String name;
    int grade;

    public Student(String studentName) {
        System.out.println("Creando uno studente di nome: " + studentName);
        name = studentName;
    }

    public void getStudentDetails() {
        System.out.println("Nome dello studente: " + name);
        System.out.println("Voto dello studente: " + grade);
    }
}