package com.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program to accept numbers from user and handle all the possible unchecked exception that can occur.

public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter numbers");

        while (flag) {
            try {
                int number = scanner.nextInt();
                System.out.println(number);
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("enter integer values");
                scanner.nextLine();
            }
        }
    }
}
