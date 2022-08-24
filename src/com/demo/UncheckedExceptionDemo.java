package com.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program to accept numbers from user and handle all the possible unchecked exception that can occur.

public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();
        System.out.println("Enter numbers");
        int[] numbers = new int[size];

        try {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }
            numbers = null;
            System.out.println(numbers.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}
