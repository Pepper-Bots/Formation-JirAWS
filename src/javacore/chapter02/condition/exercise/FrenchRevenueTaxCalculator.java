package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args){

        // Montants à tester
        // De 0€ à 11.294€ _______ : 0%
        //
        //De 11.295€ à 28.797€ __ : 11%
        //
        //De 28.798€ à 82.341€ _ : 30%
        //
        //De 82.342€ à 177.106€ _ : 41%
        //
        //Supérieur à 177.106€ ___ : 45%
        double salary = 27000;

        if (salary < 11294){
            System.out.println("Votre impôt s'élève à 0€");
        }
        else if (salary < 28797){
            salary = salary - (salary * 11 / 100);
            System.out.println("Votre salaire après impôt s'élève à : " + salary + "€");
        }
    }
}
