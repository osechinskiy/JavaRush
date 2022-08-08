package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        if (num > 0){
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            if ((num % 2) == 0){
                for (int i = num -1; i >=0; i--) {
                    System.out.println(array[i]);
                }
            }
            else
            {
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
