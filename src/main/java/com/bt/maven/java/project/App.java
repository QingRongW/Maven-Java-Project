package com.bt.maven.java.project;

import com.bt.maven.java.project.src.TestJava;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        TestJava testJava = new TestJava();
        String result = testJava.TextCompressor("aaabcc");
        System.out.println("Hello jagan!" + result);
    }
}
