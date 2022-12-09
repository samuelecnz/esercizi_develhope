package it.develhope.constructor;

public class Start {

    public static void main(String[] args) {
        Student s1 = new Student("Antonio");
        Student s2 = new Student("Luca");

        Teacher t1 = new Teacher();
        t1.teacherName = "Prof Rossi";

        t1.assignGrade(s1, 80);
        t1.assignGrade(s2, 84);

        s1.getStudentDetails();
        s2.getStudentDetails();
    }
}