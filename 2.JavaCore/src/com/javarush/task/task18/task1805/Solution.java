package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();

        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
            while (fileInputStream.available() > 0){
                int value = fileInputStream.read();
                if (!arrayList.contains(value)){
                    arrayList.add(value);
                }
            }
            Collections.sort(arrayList);
            for (Integer res:arrayList){
                System.out.print(res + " ");
            }
        }

    }
}
