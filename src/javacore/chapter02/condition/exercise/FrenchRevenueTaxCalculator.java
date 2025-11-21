package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args){

        // Rappel :
        // 3 types de salaires :
        // - Salaire brut
        // - Salaire net imposable (après déduction des cotisations sociales)
        // - Salaire net (après déduction des impôts)


        // Tranches d'imposition :
        // De 0€ à 11.294€ _______ : 0%
        //
        //De 11.295€ à 28.797€ __ : 11%
        //
        //De 28.798€ à 82.341€ _ : 30%
        //
        //De 82.342€ à 177.106€ _ : 41%
        //
        //Supérieur à 177.106€ ___ : 45%

        //  Montants à tester :
        // 10500
        // 12590
        // 53600
        // 97950
        // 195000
        double salary = 195000;

        if (salary < 11294){
            System.out.println("Votre impôt s'élève à 0€");
        }

        if (salary >= 11295){
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
            double netSalaryAfterTax = salary - (salary * 11 / 100);
            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
            double taxe = salary - netSalaryAfterTax;
            System.out.println("Le montant de votre impôt est de " + taxe + "€");
        }

        if (salary >= 28798){
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
            double netSalaryAfterTax = salary - (salary * 30 / 100);
            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
            double taxe = salary - netSalaryAfterTax;
            System.out.println("Le montant de votre impôt est de " + taxe + "€");
        }

        if (salary >= 82342){
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
            double netSalaryAfterTax = salary - (salary * 41 / 100);
            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
            double taxe = salary - netSalaryAfterTax;
            System.out.println("Le montant de votre impôt est de " + taxe + "€");
        }

        if (salary >= 177106){
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
            double netSalaryAfterTax = salary - (salary * 45 / 100);
            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
            double taxe = salary - netSalaryAfterTax;
            System.out.println("Le montant de votre impôt est de " + taxe + "€");
        }
    }
}
