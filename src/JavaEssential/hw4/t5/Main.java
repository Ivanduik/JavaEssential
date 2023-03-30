package JavaEssential.hw4.t5;

import JavaEssential.general.General;

import static JavaEssential.general.General.*;

public class Main {
    public static void main(String[] args) {
        double cel;
        int n;
        ConverterTemperature convertCel;
        System.out.println("Конвертер температури з градусів в Фаренгейти или Кельвiни.\n Введить градуси:");
        cel = inDouble();
        System.out.println("Введить 1 - Фаренгейти, 2 - Кельвiни");
        n = inInt();
        switch (n) {
            case 1 -> {
                convertCel = new Fahrenheit();
                System.out.println(n + "градусів = " + convertCel.convert(cel) + " Фаренгейт");
            }
            case 2 -> {
                convertCel = new Kelvin();
                System.out.println(n + "градусів = " + convertCel.convert(cel) + " Кельвін");
            }
            default -> System.out.println("Не віний вибір");
        }

    }
}
