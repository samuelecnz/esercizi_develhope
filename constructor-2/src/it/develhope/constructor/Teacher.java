package it.develhope.constructor;

public class Teacher {
    String teacherName;
    public Teacher() {
        System.out.println("Creando un professore");
    }

    public void assignGrade(Student alum, int finalGrade) {
        alum.grade = finalGrade;
    }
}