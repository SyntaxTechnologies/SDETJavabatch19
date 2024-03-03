package org.example.class6;

import java.util.Scanner;

/*
Ask user to enter their country and capture it.
Once values are captured print which language user speaks.
Just do this for any 5 countries

 */
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your country name");
        String country=scanner.nextLine();

        switch (country){
            case "USA":
                System.out.println("We speak English");
                break;
            case "Spain":
                System.out.println("We speak Spanish");
                break;
            case "Russia":
                System.out.println("WE speak Russian");
                break;
            case "Egypt":
                System.out.println("We speak Arabic");
                break;
            default:
                System.out.println("Country not supported");

        }

    }
}
