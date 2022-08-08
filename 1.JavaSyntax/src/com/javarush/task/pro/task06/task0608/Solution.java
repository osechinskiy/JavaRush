package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(cube(3));
    }

    public static long cube(long num){
        long result = 1;
        for (int i = 1; i <= 3; i++) {
            result = result * num;
        }
        return result;
    }
}
