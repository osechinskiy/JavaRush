package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {

        return horses;
    }

    static Hippodrome game;

    public static void main(String[] args) {
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Риша", 3, 0));
        horses.add(new Horse("Мышь", 3, 0));
        horses.add(new Horse("Гиря", 3, 0));
        game = new Hippodrome(horses);
    }
}


