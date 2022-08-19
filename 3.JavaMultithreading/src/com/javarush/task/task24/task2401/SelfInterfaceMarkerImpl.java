package com.javarush.task.task24.task2401;

public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker{
    public void print(){
        System.out.println("Hello!");
    }

    public void print(String name){
        System.out.println("Hello " + name);
    }

}
