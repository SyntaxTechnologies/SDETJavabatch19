package org.example.class9;

public class E6Array {
    public static void main(String[] args) {
        // calculate the avg of numbers which are greater than 25
        // using enhanced for loop
        int [] numbers={10,25,45,66,85,100,26,89,56,33};
        double sum=0;
        int counter=0;
        for(int n:numbers){
            if(n>25){
            sum+=n;
            counter++;
            }
        }
        System.out.println(sum/counter);

    }
}
