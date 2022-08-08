package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/


public class Solution {
    public static void main(String[] args) throws InterruptedException {
       TestThread thread = new TestThread();
        thread.start();
       Thread.sleep(5000);
        thread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            try{
            while (!thread.isInterrupted()) {
                Thread.sleep(1000);
                System.out.println("Java is so cool!");
            }
            }catch (Exception e){
                e.printStackTrace();
                thread.interrupt();
            }
        }
    }
}