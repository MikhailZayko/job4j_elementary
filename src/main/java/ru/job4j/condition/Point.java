package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double operation1 = x2 - x1;
        double operation2 = y2 - y1;
        double operation1Square = Math.pow(operation1, 2);
        double operation2Square = Math.pow(operation2, 2);
        double operation3 = operation1Square + operation2Square;
        return Math.sqrt(operation3);
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result2);
    }
}
