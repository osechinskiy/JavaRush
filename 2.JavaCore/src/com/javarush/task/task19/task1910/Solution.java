package com.javarush.task.task19.task1910;


import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName1))){
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedReader.ready()){
                stringBuilder.append(bufferedReader.readLine());
            }
            String res = stringBuilder.toString().replaceAll("\\p{P}", "");
            bufferedWriter.write(res);

        }
    }
}
