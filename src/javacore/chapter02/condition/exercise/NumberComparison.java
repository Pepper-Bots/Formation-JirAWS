package javacore.chapter02.condition.exercise;

public class NumberComparison {

    public static void main(String[] args){

        int number1 = 50;
        int number2 = 50;

        if (number1 < number2){
            System.out.println("number1 est plus petit que number2");
        }
        else if (number1 > number2) {
            System.out.println("number1 est plus grand que number2");
        }
        else {
            System.out.println("number1 est égal à number2");
        }
    }
}
