package it.develhope.classesandobjects;

public class Programmer {

        public String name;
        public String programmingLanguage;
        public int yearsOfExperience;

    public String printProgrammerDetails() {

        String details = "Il mio nome e':" + name
                            + "Programming Language: " +
                                programmingLanguage + "Anni di esperienza" + yearsOfExperience;

        return details;
    }



}

