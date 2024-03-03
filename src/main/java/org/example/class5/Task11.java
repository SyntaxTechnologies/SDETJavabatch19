package org.example.class5;

import java.util.Scanner;

/*
Write a program that will read three inputs of scores (quiz, mid term, and final scores)
and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */
public class Task11 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Quiz Scores ");
        double quiz=scan.nextDouble();
        System.out.println("Enter your Med Term Scores ");
        double medTerm=scan.nextDouble();
        System.out.println("Enter your Final Scores ");
        double finalScores=scan.nextDouble();
        double averageScore=(quiz+medTerm+finalScores)/3;
        if (averageScore>=90){
            System.out.println("Your Grade Is A");
        }else if (averageScore>=70){
            System.out.println("Your Grade Is B");
        }else if (averageScore>=50){
            System.out.println("Your Grade Is C");
        }else{
            System.out.println("Your Grade Is F");
        }
    }
}
