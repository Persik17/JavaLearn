package org.example;

import java.util.Scanner;

class GalToLit {
    public static void main(String[] args) {
        ConverterOfWater();
        MyMoonWeight();
        ConverterOfInchToMeters();
    }

    public static void ConverterOfWater() {
        double gallons;
        double liters;
        gallons = 10;
        liters = gallons * 3.7854;

        System.out.println(gallons + " галлонам соответствует " + liters + "литра");
    }

    public static void MyMoonWeight() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your weight: ");
        double weight = in.nextInt();

        System.out.println("Your weight on the Moon: " + weight*0.17);
    }

    public static void ConverterOfInchToMeters() {
        double metters, inches;
        int counter = 0;

        for (inches = 1; inches <= 15; inches++) {
            counter++;
            metters = inches * 0.0254;

            if (counter == 12) System.out.println();
            System.out.println(metters);
        }

    }
}
