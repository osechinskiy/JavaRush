package com.javarush.task.pro.task05.task0513;

import javax.xml.transform.Source;
import java.util.Arrays;

/* 
Выводим массивы
*/

public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String sct1 = Arrays.toString(strings);
        String sct2 = Arrays.toString(ints);

        System.out.println(sct1);
        System.out.println(sct2);
    }
}
