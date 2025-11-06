package javacore.chapter01.variable.exercise;

public class FirstOperations {

    public static void main(String[] args) {

        System.out.println("N°1 : Opérations Arithmétiques de base");

        int a = 56;
        int b = 25;

        int sum = a + b;

        int subtraction = a - b;

        int multiplication = a * b;

        int division = a / b;

        System.out.println(sum);

        System.out.println(subtraction);

        System.out.println(multiplication);

        System.out.println(division);

        System.out.println("La somme de a et b = " + sum);

        System.out.println("N°2 : Opérateurs Combinés avec Assignation");

        int c = 30;
        int d = 12;

        c += d; // c = c + d

        System.out.println(c);

        d -= c; // d = d - c

        System.out.println(d);

        c *= 3; // c = c * 3

        System.out.println(c);

        d /= 3;  // d = d / 3

        System.out.println(d);


        System.out.println("N°3 : Priorité des Opérateurs");


        int e = 1 * 5 + 2;

        System.out.println(e);

        int f = 1 * (5 + 2);;

        System.out.println(f);

        int g = ((2 * 5) - 2 / (4 - 2)) - 1;

        System.out.println(g);

        System.out.println("N°4 : Nettoyage du code écrit");


    }

}
