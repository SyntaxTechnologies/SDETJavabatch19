package org.example.class5;

import java.util.Scanner;

/*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season ______”.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth Month");
        String month = scan.nextLine().toLowerCase();
        switch (month) {
            case "march":
            case "april":
            case "may":
                System.out.println("You were born is season Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("You were born is season Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("You were born is season Autumn");
                break;
            case "december":
            case "january":
            case "february":
                System.out.println("You were born is season Winter");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
