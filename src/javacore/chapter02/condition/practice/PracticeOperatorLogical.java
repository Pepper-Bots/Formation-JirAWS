package javacore.chapter02.condition.practice;

public class PracticeOperatorLogical {

    public static void main(String[] args) {

        boolean trueAndTrue   = true && true;   // true
        boolean trueAndFalse  = true && false;  // false
        boolean falseAndTrue  = false && true;  // false
        boolean falseAndFalse = false && false; // false

        boolean trueOrTrue   = true || true;   // true
        boolean trueOrFalse  = true || false;  // true
        boolean falseOrTrue  = false || true;  // true
        boolean falseOrFalse = false || false; //false

        boolean notTrue  = !true;  // false
        boolean notFalse = !false; // true

        boolean trueAndTrueAndTrue  = true && true && true;  // true
        boolean trueAndTrueAndFalse = true && true && false; // false

        boolean trueOrTrueOrTrue  = true || true || true;  // true
        boolean trueOrTrueOrFalse = true || true || false; // true

        boolean notNotTrue  = !!true;  // true
        boolean notNotFalse = !!false; // false



        boolean isLoggedIn = true; // L'utilisateur est-il connecté ?

        int age = 25; // Age de l'utilisateur

        int seatsAvailable = 40; // Nb de places dispos dans l'avion


        if(isLoggedIn && age >= 18 && seatsAvailable > 0) {

            System.out.println("Réservation effectuée avec succès !");
            seatsAvailable--; //
        }

    }
}
