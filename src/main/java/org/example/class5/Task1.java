package org.example.class5;

import java.util.Scanner;

/*
You are a loan specialist and you need to
ask user what is the amount of loan is needed. If loan is less or
equal to 200,000 then you would lend the money otherwise you would
reject the client.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the amount of loan");
        int loanAmount=scanner.nextInt();
        if(loanAmount<=200000){
            System.out.println("Approved");
        }else{
            System.out.println("Rejected");
        }
    }
}
