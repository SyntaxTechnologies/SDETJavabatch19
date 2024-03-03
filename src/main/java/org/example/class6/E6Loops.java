package org.example.class6;

public class E6Loops {
    public static void main(String[] args) {

        int num=10;
        while(num>15) { // This loop will never execute
            // as the condition is false for the first time
            System.out.println(num);
            num++;
        }

    }
}
