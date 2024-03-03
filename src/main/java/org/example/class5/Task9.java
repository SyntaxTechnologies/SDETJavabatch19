package org.example.class5;

import java.util.Scanner;

/*
Write a program that will ask user to input the
current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
If anything else print invalid
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter current time in 24hr format");
        double newTime = scanner.nextDouble();

        if (newTime >= 1 && newTime <= 11) {
            System.out.println("This is morning time");
        } else if (newTime >= 12 && newTime <= 15) {
            System.out.println("This is afternoon time");
        } else if (newTime >= 16 && newTime <= 20) {
            System.out.println("This is evening time");
        } else if (newTime >= 21 && newTime <= 24) {
            System.out.println("This is night time");
        } else {
            System.out.println("Invalid input");
        }
    }
}
