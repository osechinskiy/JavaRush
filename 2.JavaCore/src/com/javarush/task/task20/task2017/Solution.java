package com.javarush.task.task20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/

public class Solution implements Serializable {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            Object o = objectStream.readObject();
            return (A) o;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


public class A implements Serializable{
}

public class B extends A {
    public B() {
        System.out.println("inside B");
    }
}

    public static void main(String[] args) {

    }
}
