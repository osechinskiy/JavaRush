package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
      reset();
    }

    public static CanFly result;

    public static void reset() {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
           String resul = reader.readLine();

           if (resul.equals("helicopter")){
               result = new Helicopter();
           } else if (resul.equals("plane")) {
               result = new Plane(20);
           }

           reader.close();
       } catch (Exception e){
           System.out.println(e);
       }

    }
}
