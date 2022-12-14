package it.develhope.interfaces;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    private boolean isGoingToBeAPhD;
    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }
    @Override
    public void studyAtHome() {
        System.out.println("Sto studiando a casa.");
    }
    @Override
    public void teachToOtherPeople() {
        System.out.println("Sto insegnando.");
    }
}

