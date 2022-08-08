package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(s);
    }

    public String pop() {
       String s;
       s = storage.get(storage.size()-1);

        return s;
    }

    public String peek() {

        return null;
    }

    public boolean empty() {
        return false;
    }

    public int search(String s) {
        return 0;
    }
}
