package org.example.class12;

/*
Create a String that should be combination of letters,
numbers and special characters. Find out how many
Alphabets(abd AZ) characters are there in the String.
 */
public class Task2 {
    public static void main(String[] args) {
        String str="kjsbf38y3875y43$Y$#**";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}
