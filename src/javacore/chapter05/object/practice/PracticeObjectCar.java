package javacore.chapter05.object.practice;

public class PracticeObjectCar {


    String brand;
    String model;
    String color;
    double price;
    double odometer;

    String serialNumber;

    public double run(double distance){

        System.out.println("La voiture roule pendant " + distance + " kms.");
        odometer += distance;
        return distance;
    }

}
