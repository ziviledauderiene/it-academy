package com.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void task7() {
        int year = 365;
        int hours = 0;
        int minutes = 0;
        for (int i = 1; i <= year; i++) {
            hours += 24;
            minutes += 1440;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public static void task8() {
        int year = 365;
        int hours = 0;
        int minutes = 0;
        int i = 1;
        while (i <= year) {
            hours += 24;
            minutes += 1440;
            i++;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial number of " + number + " is " + factorial + ".");
    }


}
