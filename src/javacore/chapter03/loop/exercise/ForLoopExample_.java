package javacore.chapter03.loop.exercise;

public class ForLoopExample_ {

    public static void main(String[] args){

        for(int number = 1; number <= 10; number ++){
            System.out.println(number);
        }

        for(int number = 10; number >= 1; number --){
            System.out.println(number);
        }

        String letter = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        for(int i = 0; i < letter.length(); i++ ){
            System.out.println(letter);
        }
    }
}
