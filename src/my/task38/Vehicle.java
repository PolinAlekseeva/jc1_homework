package my.task38;

import java.util.Scanner;

public class Vehicle {

    String name;


    public Vehicle(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Garage<String> myCar = new Garage<>();
        myCar.setName("Bike");
        Garage<String> yourGarage = new Garage<>();
        yourGarage.setName("Auto");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the colour: ");
        String s = scanner.nextLine();
        System.out.println("Please enter the brand: ");
        String s1 = scanner.nextLine();
        System.out.println("This is a " + myCar.getName());
    }
}
