package com.demo;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {

        String s1 = "Hello";
        int num1 = 0;

        try {
            num1 = Integer.parseInt(s1);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println("num1 = " + num1);
    }
}
