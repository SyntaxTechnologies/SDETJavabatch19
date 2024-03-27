package org.example.class13;

/*
Create a method which is going to take an array as input
and its going to return the count of number which are
greater than 10 in that array
 */
public class Task4 {

    int addArray(int [] arr){
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>10){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Task4 e2=new Task4();
        int [] ar={10, 20, 30, 5, 88, 99, 5};
        int result= e2.addArray(ar);
        System.out.println(result);
    }
}
