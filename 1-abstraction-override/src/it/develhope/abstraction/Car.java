package it.develhope.abstraction;

public class Car extends Vehicle {
    public int numberOfDoors;
    public double carPrice;

    public Car(int numberOfWheels, int numberOfDoors, double carPrice) {
        super("Car", numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Numero di porte: " + numberOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Accensione auto");
    }
}