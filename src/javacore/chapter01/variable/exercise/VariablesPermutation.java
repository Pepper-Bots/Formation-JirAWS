package javacore.chapter01.variable.exercise;

public class VariablesPermutation {

    public static void main(String[] args) {


        int a = 20;
        int b = 30;
        int c = b;

        System.out.println("la valeur de 'a' est: " + a);
        System.out.println("la valeur de 'b' est: " + b);
        System.out.println("la valeur de 'c' est: " + c);

        c = a;
        a = b;
        b = c;

        System.out.println("la valeur de 'a' est devenue: " + a);
        System.out.println("la valeur de 'b' est devenue: " + b);
        System.out.println("la valeur de 'c' est devenue: " + c);

    }


}
