package it.develhope.classesandobjects;

public class Competition {


    public static void main(String[] args) {

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "Microsoft";
        teamB.teamName = "Apple";

        teamA.p1.name = "Samuele";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 0;

        teamA.p2.name = "Nicola";
        teamA.p2.programmingLanguage = "Javascript";
        teamA.p2.yearsOfExperience = 2;

        teamB.p1.name = "Antonio";
        teamB.p1.programmingLanguage = "Python";
        teamB.p1.yearsOfExperience = 6;

        teamB.p2.name = "Vincenzo";
        teamB.p2.programmingLanguage = "C++";
        teamB.p2.yearsOfExperience = 5;

        System.out.println(teamA.printTeamDetails());
        System.out.println(teamB.printTeamDetails());


    }
}
