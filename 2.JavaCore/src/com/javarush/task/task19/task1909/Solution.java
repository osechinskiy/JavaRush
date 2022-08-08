package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileNmae2 = reader.readLine();
        reader.close();

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileNmae2))){
            StringBuilder stringBuilder = new StringBuilder();

            while (fileReader.ready()){
               stringBuilder.append(fileReader.readLine());
            }

            String replaceMent = stringBuilder.toString().replace(".", "!");
            fileWriter.write(replaceMent);
        }
    }
}
