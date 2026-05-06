package javacore.chapter03.loop.exercise;

public class SmallestDivisorFinder {

    public static void main(String[] args){

        // https://www.jiraws.com/view/courses/1c49469b-da5b-4509-b6a7-da5b2643a200/3002941-chap-n-3-les-boucles/9277114-exercice-trouvez-le-plus-petit-diviseur-d-un-nombre-autre-que-1
        // Valeurs à tester :
        // 50
        // 34
        // 25
        // 9
        // 6
        // 5
        int number = 17;
        int divisor = 2;

        while (number % divisor != 0){

            System.out.println(divisor + " n'est pas un diviseur de " + number);
            divisor++;
        }

        System.out.println(divisor + " est le plus petit diviseur de " + number);

        if(number == divisor){
            System.out.println("On peut dire que c'est un nombre premier !");
        }
    }
}
