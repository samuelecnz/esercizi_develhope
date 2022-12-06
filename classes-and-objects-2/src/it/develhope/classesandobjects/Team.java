package it.develhope.classesandobjects;

public class Team {

    String teamName;

    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public String printTeamDetails() {

        String details = "Nome team " + teamName
                + " Dettagli programmatore 1 " + p1.printProgrammerDetails() + " Dettagli programmatore 2 " + p2.printProgrammerDetails();

   return details;

    }


}
