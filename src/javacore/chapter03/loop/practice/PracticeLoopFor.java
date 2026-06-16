package javacore.chapter03.loop.practice;

public class PracticeLoopFor {

    public static void main(String[] args){

        int result = 0;

        int currentNumber = 1;
        int maxNumber = 100;

        while (currentNumber <= maxNumber) {

            System.out.println("Result = " + result + " + " + currentNumber);
            result += currentNumber; // result = result + currentNumber
            System.out.println("-------> " + result);

            currentNumber++;
        }

        System.out.println("Somme des nb de 1 à 100 : " + result);

        int result2 = 0;

        // Pour un nb = 1 - tant que ce nb est inf ou égal au nb max - on incrémente nb de 1
        for (int cNumber = 1 ; cNumber <= maxNumber ; cNumber++) {

            System.out.println("Result = " + result2 + " + " + cNumber);
            result2 += cNumber; // result2 = result2 + cNumber
            System.out.println("-------> " + result2);

        }
        System.out.println("Somme des nb de 1 à 100 : " + result2);



        for (int a = 1 ; a <= 100 ; a++) {

            if( a % 2 == 0 ){

                int resultForIf = 0;

                for (int b = 1 ; b <= a ; b++){

                    resultForIf += b;
                }
                System.out.println("Somme des nb entre 1 et " + a + " : " + resultForIf);
            }

            else{
                System.out.println("Le nb suivant est impair : " + a);
            }
            }
        }


    // Ici boucle For est préférable pour lisibilité


}
