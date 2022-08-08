package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int [] byteMin = new int[256];
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byteMin[fileInputStream.read()] += 1;
            }
        }
        int minValue = Integer.MAX_VALUE;
        for(int value: byteMin) {
            if (value < minValue && value != 0) minValue = value;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < byteMin.length; i++) {
            if (byteMin[i] == minValue) arrayList.add(i);
        }
        for (Integer result : arrayList){
            System.out.print(result + " ");
        }

    }
}

