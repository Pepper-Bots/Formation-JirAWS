package javacore.chapter03.loop.exercise;

import java.util.Arrays;
import java.util.List;

public class ForLoopExample_ {

    public static void main(String[] args){

        // Affichez les nombres de 1 à 10
        for(int number = 1; number <= 10; number ++){
            System.out.println(number);
        }

        // Affichez les nombres de 10 à 1
        for(int number = 10; number >= 1; number --){
            System.out.println(number);
        }

        // Affichez les lettres de A à Z
        List<String> letter = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        for (int i = 0; i < letter.size(); i++ ){
            System.out.println(letter.get(i));
        }
    }
}
