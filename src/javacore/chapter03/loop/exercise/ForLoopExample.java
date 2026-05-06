package javacore.chapter03.loop.exercise;

import java.util.Arrays;
import java.util.List;

public class ForLoopExample {

    public static void main(String[] args){

//        // Affichez les nombres de 1 à 10
        for(int number = 1; number <= 10; number ++){
            System.out.println(number);
        }

//        // Affichez une séquence en ordre décroissant
        for(int number = 10; number >= 1; number --){
            System.out.println(number);
        }

//        // Affichez l'alphabet
        List<String> letter = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        for(int i = 0; i < letter.size(); i++ ){
            System.out.println(letter.get(i));
        }

        char test = 'A';

        for(int alphaCounter = 1; alphaCounter <= 26; alphaCounter++){
            System.out.println(test);
            System.out.println((int) test);
            test++;
        }

        // Calculez une factorielle : Utilisez une boucle for pour calculer et afficher le résultat d'une factorielle.
        //Exemple d'affichage : La factorielle de 4 est 24
        // factorielle d'un entier naturel n est notée n! = produit des nb entiers strictement positifs inférieurs ou égaux à n
        // Factorielle de 5! = 5 * 4 * 3 * 2 * 1 = 120
        int n = 5;
        long factorielle = 1;
        for(int i = 1; i <= n; i++){
            factorielle *= i;
        }
        System.out.println("La factorielle de " + n + " est : " + factorielle);
    }
}
