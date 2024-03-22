package org.example.review5;

public class E4_2DArrays {
    public static void main(String[] args) {
        // write code to add numbers which are above 50
        int [][] numbers={
                {10,20,30,40},
                {50,70,15,88},
                {45,52,89,77},
        };
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]>50){
                sum=sum+numbers[i][j];}
            }
        }
        System.out.println(sum);


        
    }
}
