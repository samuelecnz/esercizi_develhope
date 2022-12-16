package it.develhope.abstraction;

public abstract class Vehicle {
    public String type;
    public int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public void showVehicleDetails() {
        System.out.println("Type: " + type);
        System.out.println("Numero di ruote: " + numberOfWheels);
    }

    public abstract void doVehicleSound();
}

