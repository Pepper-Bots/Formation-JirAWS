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
        // tester avec diviseur = 2
        // effacer tous les chiffres divisibles par 2
        // tester + effacer chiffres divisibles par 3
        // tester + effacer chiffres divisibles par 5
        // tester + effacer chiffres divisibles par 7
        // Tous les chiffres restants = nb premiers

        // Tableau de booléens :
        // true = nombre premier potentiel
        boolean[] premier = new boolean[101];

        // Initialisation : tous les nombres >= 2 sont supposés premiers
        for (int i = 2; i <= 100; i++){
            premier[i] = true;
        }

        // On élimine les multiples
        for(int i = 2; i <= 100; i ++){

            if (premier[i]){

                // Supprime tous les multiples de i
                for (int j = i * 2; j <= 100; j += i){
                    premier[j] = false;
                }
            }
        }

        // Affichage nombres premiers
        System.out.println("Nombres premiers entre 1 et 100 :");

        for (int i = 2; i <= 100; i++){
            if (premier[i]){
                System.out.println(i + " ");
            }
        }
//        int number = 15;
//        int divisor = 2;
//        int primeNumber;
//
//        while (number % divisor != 0){
//            System.out.println(divisor + " n'est pas un diviseur de " + number);
//            divisor++;
//        }
//        System.out.println("1 est le plus petit diviseur de " + number);
//        number++;
//
//        if (number % 2 == 0 && number % number == 0){
//
//            System.out.println(number + " n'est divisable que par lui-même et par 1, on peut donc dire que c'est un nombre premier");
//        }
//
//        for(divisor = 1; number % divisor != 0; divisor++){
//            System.out.println(divisor + " n'est pas un diviseur de " + number);
//
//        }
//
//        int[] tableauNombres = {1, 2, 100};
//
    }
}
