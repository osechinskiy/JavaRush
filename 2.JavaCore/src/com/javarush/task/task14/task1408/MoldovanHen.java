package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country{
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription(){
        return String.format(super.getDescription() + " Моя страна - %s. Я несу %d яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
