package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }


    public static void main(String[] args) throws InterruptedException {

    }

    public static class Thread1 extends Thread{
        public void run(){
            try {
                while (true) {
                    sleep(1000);
                    System.out.println("infinity");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static class Thread2 extends Thread{
        public void run(){
            try {
                sleep(5000);
                System.out.println("Thred2");
                }catch (InterruptedException e){
                    System.out.println("InterruptedException");
                }
            }
    }

    public static class Thread3 extends Thread{
        public void run(){
            try {
                while (!interrupted()) {
                    System.out.println("Ура");
                    sleep(500);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class Thread4 extends Thread implements Message{
        public void run(){
            try {
                while (true) {
                    sleep(1000);
                    System.out.println("Message");
                }
            }catch (Exception e){
                System.out.println("Message is down");}
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Thread5 extends Thread{
        public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int result = 0;
            String str = "";
            try {
                while (!(str = reader.readLine()).equals("N")) {
                    result = result + Integer.parseInt(str);
                }
                System.out.println(result);

            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}