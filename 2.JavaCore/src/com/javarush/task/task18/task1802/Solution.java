package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileNmae = bufferedReader.readLine();
        int minByte = Integer.MAX_VALUE;

        try (FileInputStream fileInputStream = new FileInputStream(fileNmae)){
            while (fileInputStream.available() > 0){
                int fileByte = fileInputStream.read();
                if (minByte > fileByte) minByte = fileByte;
            }
            System.out.println(minByte);
        }

    }
}
