package org.example.class5;

import java.util.Scanner;

/*
Ask user to enter a number and then categorize if number is
small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        if(number>=1 && number<=10){
            System.out.println("This number is Small.");
        } else if (number>=11 && number <=100) {
            System.out.println("This number is Medium.");
        } else if (number>=101 && number <=1000) {
            System.out.println("This number is large");
        }
    }
}
