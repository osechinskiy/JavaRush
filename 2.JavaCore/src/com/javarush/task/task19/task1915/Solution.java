package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        String res = byteArrayOutputStream.toString();
        System.setOut(consoleStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNmae = reader.readLine();
        reader.close();

        try (FileOutputStream bufferedWriter = new FileOutputStream(fileNmae)) {
            bufferedWriter.write(res.getBytes());
        }
        System.out.println(res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

