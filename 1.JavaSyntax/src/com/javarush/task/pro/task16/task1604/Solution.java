package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Calendar.LONG_STANDALONE;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1994, Calendar.MARCH, 13);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {


        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, LONG_STANDALONE, new Locale("ru","RU"));
    }
}
