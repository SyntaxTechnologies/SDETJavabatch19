package org.example.class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        // new Scanner(System.in) creating the object
        Scanner scan= new Scanner(System.in);

        System.out.println("Please Enter your age");
        //scan.nextInt(); we are calling the nextInt method to take the input from the keyword
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old");


    }
}
