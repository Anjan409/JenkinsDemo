package com.luv2code.junitdemo;

public class SonarDemo {
    public static void m1() {
        String mayBeNUll = null;
        System.out.println("Hello!! " + mayBeNUll);

        for (int i = 0; i < 0; i++) {
            System.out.println("Not Run");
        }
    }
}