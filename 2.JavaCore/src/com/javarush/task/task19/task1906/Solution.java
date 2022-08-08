package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        reader.close();

        try (FileReader fileReader = new FileReader(fileName1);
            FileWriter fileWriter = new FileWriter(fileName2)){

            int counter = 1;
            while (fileReader.ready()){
                int byteChar = fileReader.read();
                if ((counter % 2 == 0)){
                    fileWriter.write(byteChar);
                }
                counter++;
            }
        }
    }
}
