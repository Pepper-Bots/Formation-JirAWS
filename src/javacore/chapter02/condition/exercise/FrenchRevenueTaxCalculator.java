package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {

        final double Bracket_Salary = 177106;
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
        double salary = 200000;
        System.out.println("Votre salaire net imposable est de : " + salary + "€.");

        double computeSalary = 200000;
        float totalTax = 0F;

        if (salary > Bracket_Salary) {

            // Tranche 5 :
            double salaryTax45Bracket5 = salary - 177106;
            double tax5 = salaryTax45Bracket5 * 45 / 100;

            salary = 177105;

            // Calcul final :
            totalTax += tax5;

            System.out.println("Le montant total de vos taxes à payer est de " + totalTax + "€.");

        } if (salary >= 82342) {

            // Tranche 4 :
            double salaryTax41Bracket4 = salary - 82342;
            double tax4 = salaryTax41Bracket4 * 41 / 100;

            salary = 82342;

            // Calcul final :
            totalTax += tax4;

            System.out.println("Le montant total de vos taxes à payer est de " + totalTax + "€.");

        } if (salary >= 28798) {

            // Tranche 3 :
            double salaryTax30Bracket3 = salary - 28798;
            double tax3 = salaryTax30Bracket3 * 30 / 100;

            salary = 28798;

            // Calcul final :
            totalTax += tax3;

            System.out.println("Le montant total de vos taxes à payer est de " + totalTax + "€.");

        } if (salary >= 11295) {

            // Tranche 2 :
            double salaryTax11Bracket2 = salary - 11295;
            double tax2 = salaryTax11Bracket2 * 11 / 100;

            salary = 11295;

            totalTax += tax2;

            System.out.println("Le montant total de vos taxes à payer est de " + totalTax + "€.");

        } if (salary <= 11294){

        }

        // Affichage résultat final :
        double salaryNetAfterTax = computeSalary - totalTax;

        System.out.println("Le montant de votre salaire net après impôt est de " + salaryNetAfterTax + "€.");
    }
}
