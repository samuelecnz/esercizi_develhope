package it.develhope.abstraction;

public class Boat extends Vehicle {
    public double maxKnotsSpeed;
    public int boatKilosWeight;

    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }
    @Override
    public void doVehicleSound() {
        System.out.println("Accensione motore");
    }

    public String getBoatWeightAndSpeed() {
        return "Peso totale: " + boatKilosWeight + " kg, Velocita' massima: " + maxKnotsSpeed + " nodi";
    }
}

    

