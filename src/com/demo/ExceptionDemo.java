package com.demo;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] age = {60, 5, 89, 100, 91, 4, 78, 30, 32, 45};

        try {
            for (int i = 0; i < age.length; i++) {
                System.out.println(age[i]);
            }
            System.out.println("From try block");
            int[] arr = new int[10];
            arr = null;
           // System.out.println(arr.length);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
            System.out.println(e);
        }catch (NegativeArraySizeException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("will execute if exception or not");
            scanner.close();
        }
        System.out.println("From main method");
    }
}
