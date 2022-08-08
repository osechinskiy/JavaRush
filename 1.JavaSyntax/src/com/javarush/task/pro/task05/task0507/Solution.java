package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        array = new int[cnt];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min < array[i]){
                min = array[i];
            }
        }

        System.out.println(min);
    }

}
