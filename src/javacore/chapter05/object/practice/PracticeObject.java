package javacore.chapter05.object.practice;

public class PracticeObject {

    public static void main(String[] args){

        PracticeObjectCar car1 = new PracticeObjectCar();
        car1.brand = "Ferrari";
        car1.model = "F458";
        car1.color = "rouge";
        car1.price = 260000;
        car1.odometer = 0;
        car1.serialNumber = "FPJAGPHG676";

//        System.out.println("Ma voiture de la marque " + carBrand1 + " est un modèle " + carModel1 + ", elle est " + carColor1 + " et j'ai parcouru " + carOdometer1 + "kms avec.");
//        carOdometer1 += run(1000);

        String carBrand2 = "Ferrari";
        String carModel2 = "F458";
        String carColor2 = "rouge";
        double carOdometer2 = 0;

//        System.out.println(carOdometer1);
    }

    public static double run(double distance) {

        System.out.println("La voiture roule pendant " + distance + " kms.");

        return distance;
    }
}
