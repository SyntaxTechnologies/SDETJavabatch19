package org.example.class13;
/*
Write a method to return whether given number is prime or not?

 */
public class Task2 {


    boolean isPrime(int n){

        if(n<=1){
            return false;
        }else if(n==2||n==3){
            return true;
        }
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

}
