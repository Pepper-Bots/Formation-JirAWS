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
        double salary = 195000;
        double taxe = 0;

        double netSalaryAfterTax = salary - taxe;
        double salaryTax45Bracket5 = 0;
        double salaryTax41Bracket4 = 0;
        double salaryTax30Bracket3 = 0;
        double salaryTax11Bracket2;

        if (salary > 177106) {
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");

            salaryTax45Bracket5 = salary - 177106;
            netSalaryAfterTax = salary - (salaryTax45Bracket5 * 45 / 100);

            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");

            taxe = salary - netSalaryAfterTax;

            System.out.println("Le montant de votre impôt est de " + taxe + "€");

        } else if (salary >= 82342) {
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
            salaryTax41Bracket4 = salaryTax45Bracket5 - 82342;
            netSalaryAfterTax = salaryTax41Bracket4 - (salary * 41 / 100);
            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
            taxe = salary - netSalaryAfterTax;
            System.out.println("Le montant de votre impôt est de " + taxe + "€");

        } else if (salary >= 28798) {
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
            salaryTax30Bracket3 = salaryTax41Bracket4 - 28798;
            netSalaryAfterTax = salaryTax30Bracket3 - (salary * 30 / 100);
            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
            taxe = salary - netSalaryAfterTax;
            System.out.println("Le montant de votre impôt est de " + taxe + "€");

        } else if (salary >= 11295) {
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
            salaryTax11Bracket2 = salaryTax30Bracket3 - 11295;
            salary = salary - 11295;
            netSalaryAfterTax = salaryTax11Bracket2 - (salary * 11 / 100);
            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
            taxe = salary - netSalaryAfterTax;
            System.out.println("Le montant de votre impôt est de " + taxe + "€");
        }

        else {
            System.out.println("Votre impôt s'élève à 0€");
        }


    }
}
