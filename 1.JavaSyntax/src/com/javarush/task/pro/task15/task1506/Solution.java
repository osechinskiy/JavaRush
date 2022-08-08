package com.javarush.task.pro.task15.task1506;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            List<String> line = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (String element: line) {
                char[] elements = element.toCharArray();
                for (char index : elements) {
                    if (index != ' ' && index != '.' && index != ','){
                        System.out.print(index);
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Что то пошло не так бро");
        }
    }
}

