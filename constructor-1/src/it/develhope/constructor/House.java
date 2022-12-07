package it.develhope.constructor;

public class House {

    public String address;
    public int numberOfFloors;

    //Creo il costruttore per House
    public House(String _address, int _numberOfFloors) {

        address = _address;
        numberOfFloors = _numberOfFloors;

        System.out.println("Oggetto house creato " + address + "Numero dei piani " + numberOfFloors);

    }
}




