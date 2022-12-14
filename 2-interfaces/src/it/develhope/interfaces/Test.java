package it.develhope.interfaces;

public class Test {
    public static void main(String[] args) {
        // Create objects for each subclass
        Student student = new Student("Nicola", "Rossi", 545252, 1);
        Professor professor = new Professor("Vincenzo", "Dilillo", 654321, "Matematica");
        Assistant assistant = new Assistant("Antonio", "Andretti", 511681, true);

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
