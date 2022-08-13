package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {

        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String [] stringToken = new String[stringTokenizer.countTokens()];
        int position = 0;
        while (stringTokenizer.hasMoreTokens()){
            stringToken[position] = stringTokenizer.nextToken();
            position++;
        }
        return stringToken;
    }
}
