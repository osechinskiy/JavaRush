package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try (OutputStream outputStream = connection.getOutputStream();
             PrintStream sendner = new PrintStream(outputStream))
        {
            sendner.println("Привет!");

        } catch (Exception e){
            System.out.println(e);
        }

        try (InputStream inputStream = connection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream)))
        {
            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

