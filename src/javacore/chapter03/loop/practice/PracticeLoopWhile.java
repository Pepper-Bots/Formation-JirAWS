package javacore.chapter03.loop.practice;

public class PracticeLoopWhile {
    
    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            System.out.println("Condition - Age = " + age);
        }

        while (age < 18) {
            System.out.println("Boucle - Age = " + age);
            age++; // age = age +1;
        }

        System.out.println("On est sorti de la boucle");

        int resultBadWay = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;

        System.out.println("Résultat : " + resultBadWay);


        int result = 0;

        int currentNumber = 1;
        int maxNumber = 10;

        while (currentNumber <= maxNumber) {

            System.out.println("Result = " + result + " + " + currentNumber);
            result += currentNumber; // result = result + currentNumber
            System.out.println("-------> " + result);

            currentNumber++;
        }

        System.out.println("Somme des nb de 1 à 100 : " + result);

    }
}




