package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.Arrays;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths(){
        Month[] array = new Month[3];
        array[0] = DECEMBER;
        array[1] = JANUARY;
        array[2] = FEBRUARY;

        return array;
    }

    public static Month[] getSpringMonths(){
        Month[] array = new Month[3];
        array[0] = MARCH;
        array[1] = APRIL;
        array[2] = MAY;

        return array;
    }

    public static Month[] getSummerMonths(){
        Month[] array = new Month[3];
        array[0] = JUNE;
        array[1] = JULY;
        array[2] = AUGUST;

        return array;
    }

    public static Month[] getAutumnMonths(){
        Month[] array = new Month[3];
        array[0] = SEPTEMBER;
        array[1] = OCTOBER;
        array[2] = NOVEMBER;

        return array;
    }
    //напишите тут ваш код

}
