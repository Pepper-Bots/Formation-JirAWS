package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {

    public static void main (String[] args){

        // Forfait Basique : 50€
        // Forfait Jeune : <= 25 ans -> 37,5€
        // Forfait Senior : >= 65 ans -> 12,5€

        // ages à tester : entre 25 et 65 ans / - de 25 ans / + de 65 ans
        int age = 50;

        // prix à tester : 50€ / 37,5€ / 12,5€
        double price = 50;

        if (age <= 25){
            price = price * 0.75;
            System.out.println("Vous êtes éligible au forfait Jeune, vous bénéficiez du tarif de : " + price + "€.");
        }
        else if (age >= 65){
            price = price * 0.25;
            System.out.println("Vous êtes éligible au forfait Senior, vous bénéficier du tarif de : " + price + "€.");
        }
        else {
            System.out.println("Vous bénéficiez du forfait Basique pour un montant de : " + price + "€");
        }
    }
}
