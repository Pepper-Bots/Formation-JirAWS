package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {

    public static void main(String[] args){

        double number = 589.35;

        if (number > 0){
            System.out.println("Le nombre est positif");
        }
        else if (number < 0) {
            System.out.println("Le nombre est négatif");
        }
        else {
            System.out.println("Le nombre est neutre");
        }

        // BONUS

        if (number > 0){
            System.out.println("Le nombre est positif");
        }
        else if (number <= 0) {
            System.out.println("Le nombre est neutre ou négatif");
        }
    }
}
