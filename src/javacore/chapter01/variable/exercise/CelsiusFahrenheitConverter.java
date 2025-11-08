package javacore.chapter01.variable.exercise;

public class CelsiusFahrenheitConverter {

    public static void main(String[] args){

        // Celsius vers Fahrenheit : °F = (TempératureEnCelsius × 1,8) + 32
        // Après recherche internet : °F=(°C×1,8)+32.

        int CelsiusTemp = 35;

        float FahrenheitTemp = (CelsiusTemp * 9/5) + 32;

        System.out.println(CelsiusTemp + "C° = " + FahrenheitTemp + "F°.");

    }
}
