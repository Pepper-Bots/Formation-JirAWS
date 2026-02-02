package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main(String[] args){

        int a = 130;
        int b = 130;
        int c = 72;

        if (a > b && a > c){
            System.out.println("'a' est la valeurs la + grande");
        } else if (b > a && b > c) {
            System.out.println("'b' est la valeurs la + grande");
        } else if (a == b && b == c){
            System.err.println("Toutes les valeurs sont égales, il n'y a en pas une plus grande que les autres.");
        } else if ( a == b && b != c){
            System.err.println("Les valeurs de a et b sont égales.");
        }else {
            System.out.println("'c' est la valeurs la + grande");
        }
    }
}
