package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        boolean bool = false;

        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите строку " + i + ": ");
            strings[i] = scanner.nextLine();
        }


        for (int i = 0; i < strings.length; i++) {
           String str = strings[i];
           if (str == null){
               continue;
           }else {
               for (int j = 0; j < strings.length; j++) {
                   if (str.equalsIgnoreCase(strings[j])) {
                       if (strings[i] != strings[j]) {
                           strings[j] = null;
                           strings[i] = null;
                       }
                   }
               }
           }
        }


        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
//"Hello", "Hello", "World", "Java", "Tasks", "World"