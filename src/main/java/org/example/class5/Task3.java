package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your city: ");
        String city = scan.nextLine();

        System.out.print("What is the temperature in your city? ");
        double temperatureF = scan.nextDouble();
        // Convert fahrenheit to celsius
        double tempCelsius = (temperatureF - 32.0) * 5.0/9.0;

        System.out.println("The temperature in the " + city + " is " + tempCelsius + "°C");
    }
}
