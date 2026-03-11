package javacore.chapter03.loop.exercise;

public class WhileLoopExample {

    public static void main(String[] args){

//        int loopCounter = 1;
//
//        while(loopCounter <= 10){
//
//            loopCounter++;
//
//            System.out.println("Hello world");
//        }
//
//        // Affichez les nombres de 1 à 10
//        int number = 0;
//
//        while (number<10){
//            number++;
//            System.out.println(number);
//        }
//
//        // Affichez une séquence en ordre décroissant
//        int numberDec = 11;
//
//        while (numberDec>1){
//            numberDec--;
//            System.out.println(numberDec);
//        }

        // BONUS
        int finBoucle = 20;
        int numberBonus = 1;

        while(true){
            numberBonus ++;
            if(numberBonus % 2 == 0){
                System.out.println(numberBonus);
            }
            if (numberBonus == finBoucle) {
                break;
            }
        }

    }
}
