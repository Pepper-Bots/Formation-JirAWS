package javacore.chapter01.variable.exercise;

public class PrimitiveOverflow {

    public static void main(String[] args){

        short hourSeconds = 1200;

        System.out.println("Nb de secondes dans 1 heure: " + hourSeconds);

        int daySeconds = 24 * hourSeconds;

        System.out.println("Nb de secondes dans 1 jour: " + daySeconds);

        int weekSeconds = 7 * daySeconds;

        System.out.println("Nb de secondes dans 1 semaine: " + weekSeconds);

        int monthSeconds = 30 * daySeconds;

        System.out.println("Nb de secondes dans 1 mois: " + monthSeconds);

        int yearSeconds = 365 * daySeconds;

        System.out.println("Nb de secondes dans 1 année: " + yearSeconds);


    }
}
