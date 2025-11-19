package javacore.chapter02.condition.exercise;

public class AgeCategorization {

    public static void main(String[] args){

        // Valeurs à tester : < 10 ans / 10 <= x < 18 ans / 18 <= x < 25 ans / 25 <= x < 65 ans / x >= 65 ans
        int age = 10;

        if (age < 10){
            System.out.println("Le sujet est un enfant");
        } else if (age < 18){
            System.out.println("Le sujet est un adolescent");
        } else if (age < 25){
            System.out.println("Le sujet est un jeune adulte");
        } else if (age < 65) {
            System.out.println("Le sujet est un adulte");
        } else {
            System.out.println("Le sujet est un sénior");
        }
    }
}
