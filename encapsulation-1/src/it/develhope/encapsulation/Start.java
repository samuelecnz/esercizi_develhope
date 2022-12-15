package it.develhope.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

 public class Start {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter the number of floors: ");
            int floorsNumber = scanner.nextInt();
            
            System.out.println("Enter the address of the house: ");
            String address = scanner.nextLine();
            
            System.out.println("Enter the residents names (separated by a comma): ");
            String residentsNamesString = scanner.nextLine();
            String[] residentsNames = residentsNamesString.split(",");
            
            House house = new House(floorsNumber, address, residentsNames);
            
            System.out.println(String.format("House details: \nFloors: %d \nAddress: %s \nResidents: %s",
                    house.getFloorsNumber(), house.getAddress(), Arrays.toString(house.getResidentsNames())));
        }
    }
