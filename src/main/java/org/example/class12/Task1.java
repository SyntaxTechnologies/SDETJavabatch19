package org.example.class12;
/*
Create a String that will hold a sentence.
Write a program to get a new String without any spaces From above
String.
 */
public class Task1 {
    public static void main(String[] args) {
        String str="Java is Very eASY";
        String newString=str.replaceAll(" ","");
        System.out.println(newString);
        System.out.println(str.replaceAll(" ",""));

    }
}
