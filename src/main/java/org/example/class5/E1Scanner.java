package org.example.class5;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
        /*
        Scanner => is a non-primitive data type
        scan => is just a variable name
        = simple the assignment operator
        new Scanner(System.in) => creates an object
        of the scanner class.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        }else{
            System.out.println("You need to wait");
        }




    }
}
