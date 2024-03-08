package org.example.review3;

import java.util.Scanner;

public class E8Loops {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number=10;
        while(number>5){
            System.out.println("Please Enter a Number");
            number=scanner.nextInt();
        }

    }
}
