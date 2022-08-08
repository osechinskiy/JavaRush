package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javaRush = JavarushQuest.values();
        for (JavarushQuest java:
             javaRush) {
            System.out.println(java.ordinal());
        }
    }
}
