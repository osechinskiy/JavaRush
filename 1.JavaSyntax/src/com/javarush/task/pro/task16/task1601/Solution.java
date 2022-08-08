package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(94,2,13);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String message = null;
        int dayOfWeek = date.getDay();
        switch (dayOfWeek){
            case 1:
                message = "Понедельник";
                break;
            case 2:
                message = "Вторник";
                break;
            case 3:
                message = "Среда";
                break;
            case 4:
                message = "Четверг";
                break;
            case 5:
                message = "Пятница";
                break;
            case 6:
                message = "Суббота";
                break;
            case 0:
                message = "Воскресенье";

        }
        return message;
    }
}
