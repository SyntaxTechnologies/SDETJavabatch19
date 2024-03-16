package org.example.class9;

public class E1Array {
    public static void main(String[] args) {

        int [] numbers={10,25,45,66,85,100};
        System.out.println(numbers.length);
        System.out.println(numbers[3]);
       // System.out.println(numbers[-5]);
        for (int i = 2; i <numbers.length ; i++) {
            System.out.println(i+" "+numbers[i]+" ");

        }


    }
}
