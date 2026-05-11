package javacore.chapter03.loop.exercise;

public class HalfPyramid {

    public static void main(String[] args) {


//Indice N°1 : La boucle externe itère sur les lignes.
// La boucle interne détermine combien d'astérisques afficher pour chaque ligne.
//Indice N°2 : Vous pouvez utiliser System.out.print("*") pour afficher des caractères sur la même ligne,
// et System.out.println() pour passer à la ligne suivante.

        for (int numberOfRows = 5; numberOfRows <= 5; numberOfRows++) { // affichage de 1 à 5 lignes
            for (int i = 1; i <= numberOfRows; i+=numberOfRows) { // Affichage nombre d'étoiles par ligne
                System.out.println("*");
                System.out.println();
                System.out.println("**");
                System.out.println();
                System.out.println("***");
                System.out.println();
                System.out.println("****");
                System.out.println();
                System.out.println("*****");
            }

        }
    }
}



