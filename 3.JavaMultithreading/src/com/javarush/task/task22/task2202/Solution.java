package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        String [] stringSplitter = string.split(" ");
        if (stringSplitter.length < 5) throw new TooShortStringException();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringSplitter[1]);
        stringBuilder.append(" ");
        stringBuilder.append(stringSplitter[2]);
        stringBuilder.append(" ");
        stringBuilder.append(stringSplitter[3]);
        stringBuilder.append(" ");
        stringBuilder.append(stringSplitter[4]);

        return stringBuilder.toString();
    }

    public static class TooShortStringException extends RuntimeException{

    }
}
