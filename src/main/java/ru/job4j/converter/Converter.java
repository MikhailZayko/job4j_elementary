package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        float inDlr = 180;
        float expectedDlr = 3;
        float outDlr = rubleToDollar(inDlr);
        boolean passedDlr = expectedDlr == outDlr;
        System.out.println("180 rubles are 3. Test result : " + passedDlr);
    }
}
