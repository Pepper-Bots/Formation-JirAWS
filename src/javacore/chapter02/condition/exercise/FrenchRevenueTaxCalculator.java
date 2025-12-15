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
        double salary = 195000.0;
        double taxe;

        double salaryTax45Bracket5 = 0;
        double salaryTax41Bracket4 = 0;
        double salaryTax30Bracket3 = 0;
        double salaryTax11Bracket2;

        if (salary > 177106) {
            System.out.println("Votre salaire net imposable est de : " + salary + "€.");

            // Tranche 5 :
            salaryTax45Bracket5 = salary - 177106; // 17894 --> Est ce que je dois m'arrêter à 177106 ou prendre tout le salaire en compte pour cette tranche là ? -> 45 de 195k = 87750
            double netSalaryAfterTax5 = salary - (salaryTax45Bracket5 * 45 / 100); // 186947,7 --> 115302 avec salaryTax45Bracket5 à 177106

            // Tranche 4 :
            salaryTax41Bracket4 = 177106 - 82342; // --> part de salaire à prendre en compte pour cette tranche = 177106 - 82342 = 94764 (anciennement  salaryTax41Bracket4 = salaryTax45Bracket5 - 82342;)
            double netSalaryAfterTax4 = salary - (salaryTax41Bracket4 * 41 / 100);

            // Tranche 3 :
            salaryTax30Bracket3 = 82341 - 28798; // --> 82341 - 28798 ?  - Ancien calcul : salaryTax30Bracket3 = salaryTax41Bracket4 - 28798;
            double netSalaryAfterTax3 = salary  - (salaryTax30Bracket3 * 30 / 100);

            // Tranche 2 :
            salaryTax11Bracket2 = 28797 - 11295; // 11.295€ à 28.797€ - salaryTax30Bracket3 - 11295
            double netSalaryAfterTax2 = salary - ( salaryTax11Bracket2 * 11 / 100);

            // Calcul final :
            double netSalaryAfterTax = netSalaryAfterTax5 + netSalaryAfterTax4 + netSalaryAfterTax3 + netSalaryAfterTax2;

            // Affichage résultat final :
            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");


//        } else if (salary >= 82342 && salary <= 177106) {
//            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
//
//            // Tranche 4 :
//            salaryTax41Bracket4 = salaryTax45Bracket5 - 82342;
//            double netSalaryAfterTax4 = salary - (salaryTax41Bracket4 * 41 / 100);
//
//            // Tranche 3 :
//            salaryTax30Bracket3 = salaryTax41Bracket4 - 28798;
//            double netSalaryAfterTax3 = salary  - (salaryTax30Bracket3 * 30 / 100);
//
//            // Tranche 2 :
//            salaryTax11Bracket2 = salaryTax30Bracket3 - 11295;
//            double netSalaryAfterTax2 = salary - ( salaryTax11Bracket2 * 11 / 100);
//
//            // Calcul final :
//            double netSalaryAfterTax = netSalaryAfterTax4 + netSalaryAfterTax3 + netSalaryAfterTax2;
//
//            // Affichage résultat final :
//            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
//
//
//        } else if (salary >= 28798 && salary <= 82341) {
//            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
//
//            // Tranche 3 :
//            salaryTax30Bracket3 = salaryTax41Bracket4 - 28798;
//            double netSalaryAfterTax3 = salary  - (salaryTax30Bracket3 * 30 / 100);
//
//            // Tranche 2 :
//            salaryTax11Bracket2 = salaryTax30Bracket3 - 11295;
//            double netSalaryAfterTax2 = salary - ( salaryTax11Bracket2 * 11 / 100);
//
//            // Calcul final :
//            double netSalaryAfterTax = netSalaryAfterTax3 + netSalaryAfterTax2;
//
//            // Affichage résultat final :
//            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
//
//
//        } else if (salary >= 11295 && salary <= 28797) {
//            System.out.println("Votre salaire net imposable est de : " + salary + "€.");
//
//            // Tranche 2 :
//            salaryTax11Bracket2 = salaryTax30Bracket3 - 11295;
//            double netSalaryAfterTax = salary - ( salaryTax11Bracket2 * 11 / 100);
//
//            // Affichage résultat final :
//            System.out.println("Le montant de votre salaire net après impôt est de " + netSalaryAfterTax + "€.");
//
//        }
//
//        else { // Tranche 1 -> - de 11.294€
//            System.out.println("Votre impôt s'élève à 0€");
        }
//

    }
}
