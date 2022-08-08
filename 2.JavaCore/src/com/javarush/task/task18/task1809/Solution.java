package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine());
            FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine())){

            ArrayList<Integer> arrayList = new ArrayList<>();
            while (fileInputStream.available() > 0){
                arrayList.add(fileInputStream.read());
            }
            Collections.reverse(arrayList);
            for(Integer res: arrayList){
                fileOutputStream.write(res);
            }
        }

    }
}
