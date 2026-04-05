package javacore.chapter03.loop.exercise;

public interface SmallestDivisorFinder {

    public static void main(String[] args){

        // Valeurs à tester :
        // 50
        // 34
        // 15
        // 9
        // 6
        // 5
        int number = 2;
        int divisor = 2;

        while (number % divisor != 0){

            System.out.println(divisor + " n'est pas un diviseur de " + number);
            divisor++;
            break;
        }

        System.out.println(divisor + " n'est pas un diviseur de " + number);

    }
}
