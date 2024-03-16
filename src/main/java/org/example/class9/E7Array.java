package org.example.class9;

public class E7Array {
    public static void main(String[] args) {
        // Count how many even numbers are present in this array
        int [] numbers={10,25,45,66,85,100,26,89,56,33};
        int counter=0;
        for (int number : numbers) {

            if(number%2==0){
                counter++;
            }
        }
        System.out.println(counter);


    }
}
