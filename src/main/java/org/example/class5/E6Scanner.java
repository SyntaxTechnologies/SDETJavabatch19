package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=scanner.nextInt();
        System.out.println("Please Enter your Full Name");
        // extra call to nextLine to clear the buffer memory
        scanner.nextLine();
        String fullName=scanner.nextLine();
        System.out.println("Your name is "+fullName+" you are "+age+" years old");
        // Break till 11:53
    }
}
