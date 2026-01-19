package javacore.chapter02.condition.practice;

public class PracticeOperatorLogical {

    public static void main(String[] args) {

        
        // Le mode "sécurisé" s'active seulement si certaines conditions spécifiques sont remplies.
        //Voici les critères que le programme doit vérifier :
        //
        //La maison est vide OU le propriétaire est endormi.
        //
        //Toutes les portes et fenêtres sont fermées.
        //
        //L'alarme principale est activée.


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

        boolean trueAndFalseAndTrue = true && false && true; // false

        boolean trueOrTrueOrTrue  = true || true || true;  // true
        boolean trueOrTrueOrFalse = true || true || false; // true

        boolean notNotTrue  = !!true;  // true
        boolean notNotFalse = !!false; // false



        boolean isLoggedIn = true; // L'utilisateur est-il connecté ?

        int age = 25; // Age de l'utilisateur

        int seatsAvailable = 40; // Nb de places dispos dans l'avion

        boolean isPremiumMember = true; // Est-ce que le vol est réservé aux VIP ?

        boolean isVIPFlight = true; // Est-ce que le vol est réservé aux VIP ?


        if(isLoggedIn && age >= 18 && seatsAvailable > 0 && (!isVIPFlight || isPremiumMember)) {

            System.out.println("Réservation effectuée avec succès !");
            seatsAvailable--; // seatsAvailable -= 1; seatsAvailable = seatsAvailable - 1;
        }
        else {
            System.out.println("Réservation impossible, essayez plus tard.");
        }

    }
}
