package javacore.chapter02.condition.exercise;

public class FirstBooleanCondition {

    public static void main(String[] args){

        byte age = 39;
        boolean isAdult = true;

        // Implémentation de Condition if / else

        if (age >= 18) {
            System.out.println("Je suis majeure");
        }
        else {
            System.out.println("Je suis mineure");
        }

        // Manipulation d'un prédicat

        if (isAdult){
            System.out.println("Je suis majeure");
        }

    }
}
