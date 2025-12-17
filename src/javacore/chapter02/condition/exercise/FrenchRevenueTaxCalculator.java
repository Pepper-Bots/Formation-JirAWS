package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {

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
        double salary = 12590;

        double salaryTax45Bracket5 = 0;
        double salaryTax41Bracket4 = 0;
        double salaryTax30Bracket3 = 0;
        double salaryTax11Bracket2;

        if (salary > 177106) {
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");

            // Tranche 5 :
            salaryTax45Bracket5 = salary - 177106;
            double tax5 = salaryTax45Bracket5 * 45 / 100;
            // Tranche 4 :
            salaryTax41Bracket4 = 177106 - 82342;
            double tax4 = salaryTax41Bracket4 * 41 / 100;

            // Tranche 3 :
            salaryTax30Bracket3 = 82341 - 28798;
            double tax3 = salaryTax30Bracket3 * 30 / 100;

            // Tranche 2 :
            salaryTax11Bracket2 = 28797 - 11295;
            double tax2 = salaryTax11Bracket2 * 11 / 100;

            // Calcul final :
            double totalTax = tax5 + tax4 + tax3 + tax2;
            double salaryNetAfterTax = salary - totalTax;

            // Affichage résultat final :
            System.out.println("Votre salaire entre dans la tranche d'imposition maximale (5)");
            System.out.println("Le montant total de vos taxes à payer est de " + totalTax + "€.");
            System.out.println("Le montant de votre salaire net après impôts est de " + salaryNetAfterTax + "€." );


        } else if (salary >= 82342 && salary <= 177106) {
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");

            // Tranche 4 :
            salaryTax41Bracket4 = salary - 82342;
            double tax4 = salaryTax41Bracket4 * 41 / 100;

            // Tranche 3 :
            salaryTax30Bracket3 = 82341 - 28798;
            double tax3 = salaryTax30Bracket3 * 30 / 100;

            // Tranche 2 :
            salaryTax11Bracket2 = 28797 - 11295;
            double tax2 = salaryTax11Bracket2 * 11 / 100;

            // Calcul final :
            double totalTax = tax4 + tax3 + tax2;
            double salaryNetAfterTax = salary - totalTax;

            // Affichage résultat final :
            System.out.println("Votre salaire entre dans la tranche d'imposition 4");
            System.out.println("Le montant total de vos taxes à payer est de " + totalTax + "€.");
            System.out.println("Le montant de votre salaire net après impôts est de " + salaryNetAfterTax + "€." );

        } else if (salary >= 28798 && salary <= 82341) {
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");

            // Tranche 3 :
            salaryTax30Bracket3 = salary - 28798;
            double tax3 = salaryTax30Bracket3 * 30 / 100;

            // Tranche 2 :
            salaryTax11Bracket2 = 28797 - 11295;
            double tax2 = salaryTax11Bracket2 * 11 / 100;

            // Calcul final :
            double totalTax = tax3 + tax2;
            double salaryNetAfterTax = salary - totalTax;

            // Affichage résultat final :
            System.out.println("Votre salaire entre dans la tranche d'imposition 3");
            System.out.println("Le montant total de vos taxes à payer est de " + totalTax + "€.");
            System.out.println("Le montant de votre salaire net après impôts est de " + salaryNetAfterTax + "€." );//

        } else if (salary >= 11295 && salary <= 28797) {
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");

            // Tranche 2 :
            salaryTax11Bracket2 = salary - 11295;
            double totalTax1 = salaryTax11Bracket2 * 11 / 100;

            // Calcul final :
            double salaryNetAfterTax = salary - totalTax1;

            // Affichage résultat final :
            System.out.println("Votre salaire entre dans la tranche d'imposition 2");
            System.out.println("Le montant total de vos taxes à payer est de " + totalTax1 + "€.");
            System.out.println("Le montant de votre salaire net après impôt est de " + salaryNetAfterTax + "€.");

        } else {

            // Tranche 1 -> - de 11.294€
            System.out.println("Votre salaire entre dans la tranche d'imposition 1");
            System.out.println("Vous n'êtes pas imposable");
        }

    }
}
