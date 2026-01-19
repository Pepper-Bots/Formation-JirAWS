package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main(String[] args){

        int a = 130;
        int b = 85;
        int c = 72;

        if (a > b && a > c){
            System.out.println("'a' est la valeurs la + grande");
        } else if (b > a && b > c) {
            System.out.println("'b' est la valeurs la + grande");
        }else {
            System.out.println("'c' est la valeurs la + grande");
        }
    }
}
