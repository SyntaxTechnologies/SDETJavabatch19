package org.example.review3;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your Grade");
        /*
        We are calling the next method from the scanner class and on top of that
        we are calling the charAt(0) method so that we can only pick the first
        letter of the word and ignore the rest if user tries to enter more letters
         */
        char grade=scan.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Very Good Grade");
                break;
            case 'B':
                System.out.println("Good Grade");
                break;
            case 'C':
                System.out.println("Avg Grade");
                break;
            case 'D':
                System.out.println("Bad Grade");
                break;
            case 'F':
                System.out.println("You Failed you need to try again");
                break;
            default:
                System.out.println("Wrong Grade Entered");
        }


    }
}
