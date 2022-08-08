package com.javarush.task.pro.task15.task1507;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in))
        {
            List<String> line = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (int i = 0; i < line.size(); i++) {
                if ((i % 2) == 0) {
                    System.out.println(line.get(i));
                } else {
                    continue;
                }
            }
        } catch (Exception e){
            System.out.println("Что то пошло не так" + e);
        }
    }
}

