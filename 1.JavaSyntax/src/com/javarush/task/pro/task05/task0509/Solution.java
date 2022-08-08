package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

import java.lang.invoke.MutableCallSite;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
       MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < MULTIPLICATION_TABLE[0].length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[1].length; j++) {
                if (MULTIPLICATION_TABLE[0][j] == 0){
                    MULTIPLICATION_TABLE[i][j] = MULTIPLICATION_TABLE[i][j] + (j+1);
                } else {
                    MULTIPLICATION_TABLE[i][j] = MULTIPLICATION_TABLE[0][j] * (i + 1);
                }
            }
        }

        for (int i = 0; i < MULTIPLICATION_TABLE[1].length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[0].length; j++) {
                System.out.print( MULTIPLICATION_TABLE[i][j] + " ");
            }

            System.out.println();
        }

    }
}
