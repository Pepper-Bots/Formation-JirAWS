package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main(String[] args) {

        // Un nombre parfait est un entier positif qui est égal à la somme de ses diviseurs (sauf lui-même).
        // Il n'est donc, par nature, pas un nombre premier (qui n'a aucun diviseur à part 1 et lui même).

        // 6 est un nb parfait → 1 + 2 + 3 = 6

        // On va parcourir les nombres de 1 à 100 puis 1000... on incrémente le nombre à chaque itération
        for (int start = 1; start <= 10000; start++) {

            // on valorise une somme à 0 pour l'instant
            int somme = 0;

            // ici on va parcourir tous les diviseurs possibles en partant de 1,
            // tant qu'ils sont inférieurs au nombre à tester, on incrémente le diviseur
            for (int divisor = 1; divisor < start; divisor++) {

                // Si le nombre divisé par le diviseur donne 0, on garde le diviseur et on l'ajoute à la somme
                // au fur et à mesure la variable somme va conserver tous les diviseurs testés pour un nb
                if (start % divisor == 0) {
                    somme += divisor;
                }
            }
            // En parallèle de la boucle qui teste chaque diviseur
            // on teste si la somme des diviseurs est bien égale au nombre testé
            // Si c'est le cas le nb est bien parfait
            if(somme == start){
                System.out.println(start + " est un nombre parfait");
            }
        }
    }
}
