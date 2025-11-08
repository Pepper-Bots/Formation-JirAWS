package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {

    public static void main(String[] args){

// Fahrenheit vers Celsius : °C = (TempératureEnFahrenheit − 32) / 1,8
// Après recherche : °C=(°F−32)× 5 / 9

        int FahrenheitTemp = 50;

        float CelsiusTemp = (FahrenheitTemp - 32) * 5 / 9F;

        System.out.println(FahrenheitTemp + "F° = " + CelsiusTemp + "C°.");
    }
}
