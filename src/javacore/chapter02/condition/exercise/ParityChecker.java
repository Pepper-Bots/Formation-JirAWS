package javacore.chapter02.condition.exercise;

public class ParityChecker {

    public static void main(String[] args){


        int number = 553;

        System.out.println(number/2);
        System.out.println(number%2);
        System.out.println(number);

        if ( number % 2 == 0) {
            System.out.println("Le nombre donné est paire");
        }
        else {
            System.out.println("Le nombre donné est impaire");
        }


        long number2 = 3333777799999L;

        System.out.println(number2 % 2);


    }
}
