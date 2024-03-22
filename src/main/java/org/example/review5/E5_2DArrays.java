package org.example.review5;

public class E5_2DArrays {
    public static void main(String[] args) {
        // write code to add numbers which are above 50
        int [][] numbers={
                {10,20,30,40},
                {50,70,15,88},
                {45,52,89,77},
        };

        for(int[] numArray:numbers ){
            for(int num:numArray){
                System.out.print(num+" ");
            }
            System.out.println();
        }


        
    }
}
