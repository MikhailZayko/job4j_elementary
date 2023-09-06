package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] i : array) {
            for (int j = 0; j < i.length; j++) {
                if (i[j] < 0) {
                    i[j] = 0;
                }
            }
        }
        return array;
    }
}
