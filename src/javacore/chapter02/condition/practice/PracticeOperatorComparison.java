package javacore.chapter02.condition.practice;

public class PracticeOperatorComparison {

    public static void main(String[] args){

        int a = 30;
        int b = 40;

        boolean isEqual = a == b;
        System.out.println("Est-ce que 'a = " + a + "' est strictement égal à 'b = " + b + "' ? : " + isEqual);

        boolean isNotEqual = a != b;
        System.out.println("Est-ce que 'a = " + a + "' est différent ou égal à 'b = " + b + "' ? : " +isNotEqual);

        boolean isLessThan = a < b;
        System.out.println("Est-ce que 'a = " + a + "' est inférieur à 'b = " + b + "' ? : " + isLessThan);

        boolean isLessThanOrEqual = a <= b;
        System.out.println("Est-ce que 'a = " + a + "' est inférieur ou égal à 'b = " + b + "' ? : " + isLessThanOrEqual);

        int age = 20;

        boolean isThirtyOrYounger = age <= 30;
        System.out.println(isThirtyOrYounger);

        boolean isGreaterThan = a > b;
        System.out.println("Est-ce que 'a = " + a + "' est supérieur à 'b = " + b + "' ? : " + isGreaterThan);

        boolean priorityTest = 10 + a == 40;
        System.out.println("Test de priorité (10 + a == 40) : " + priorityTest);

        boolean isDoubleLessThanInt = 5.5 < 6;
        System.out.println("Test Inter-Type (5.5 < 6) : " + isDoubleLessThanInt);
    }
}
