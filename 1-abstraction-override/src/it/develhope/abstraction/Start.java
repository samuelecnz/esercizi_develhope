package it.develhope.abstraction;

public class Start {

    public static void main(String[] args) {
        Car car = new Car(4, 4, 10000);
        Boat boat = new Boat(40, 2000);

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.showVehicleDetails();
        boat.doVehicleSound();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}


