package org.example.review4;

import java.util.Scanner;

public class E5DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the number");
        int number=scanner.nextInt();
        while(number<10){
            System.out.println("Please Enter the number");
            number=scanner.nextInt();
        }
    }
}
