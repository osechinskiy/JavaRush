package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Иванов Иван", 4.6);
        grades.put("Иванов1 Иван", 3.6);
        grades.put("Иванов2 Иван", 2.6);
        grades.put("Иванов3 Иван", 1.6);
        grades.put("Иванов4 Иван", 5.0);


    }
}
