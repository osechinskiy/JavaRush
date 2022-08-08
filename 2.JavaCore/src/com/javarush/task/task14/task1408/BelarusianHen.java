package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country{
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription(){
        return String.format(super.getDescription() + " Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
    }
}
