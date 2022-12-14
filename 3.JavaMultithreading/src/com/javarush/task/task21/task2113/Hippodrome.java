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

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Риша", 3, 0));
        horses.add(new Horse("Мышь", 3, 0));
        horses.add(new Horse("Гиря", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (Horse horse : horses){
            horse.move();
        }
    }

    public void print(){
        for (Horse horse : horses){
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
    
    public Horse getWinner(){
        Horse hors = null;
        double maxDistance = 0;
       for(Horse horse : horses){
           if (maxDistance < horse.getDistance()){
               maxDistance = horse.getDistance();
               hors = horse;
           }
       }

       return hors;
    }

}


