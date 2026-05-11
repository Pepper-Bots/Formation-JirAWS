package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args){

//
//        int resultat = 17 % 5;
//        System.out.println(resultat); // 17/5 = 3.4 ou 5*3 + 2 = 17 reste 2.0 -> 5 n'est pas un diviseur de 17
//
//        resultat = 17 % 2;
//        System.out.println(resultat);
//
//        resultat = 17 % 1;
//        System.out.println(resultat); // 0
//
//        resultat = 17 % 17;
//        System.out.println(resultat); // 0
//
//
//        if(resultat == 0){
//            System.out.println("c'est un nombre premier !");
//        }

        // => comment tester les autres nb(diviseurs) pour vérifier que le nb testé est bien un primeNumber ?

    // implémentez le programme qui recherche tous les nombres premiers compris entre 1 et 100

        // créer un tableau de chiffres de 1 à 100 ?

        int number = 15;
        int divisor = 2;
        int primeNumber;

        while (number % divisor != 0){
            System.out.println(divisor + " n'est pas un diviseur de " + number);
            divisor++;
        }
        System.out.println("1 est le plus petit diviseur de " + number);
        number++;

        if (number % 2 == 0 && number % number == 0){

            System.out.println(number + " n'est divisable que par lui-même et par 1, on peut donc dire que c'est un nombre premier");
        }

        for(divisor = 1; number % divisor != 0; divisor++){
            System.out.println(divisor + " n'est pas un diviseur de " + number);


        }

    }
}
