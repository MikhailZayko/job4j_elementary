package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        } else if ("tanks".equals(name)) {
            System.out.println("Start - tanks");
        } else if ("tetris".equals(name)) {
            System.out.println("Start - tetris");
        } else {
            System.out.println("Game not found");
        }
    }

    public static void main(String[] args) {
        menu("tanks");
        menu("super mario");
        menu("tetris");
        menu("League of Legends");
    }
}
