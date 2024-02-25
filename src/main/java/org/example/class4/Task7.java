package org.example.class4;

public class Task7 {
    public static void main(String[] args) {
        int num1=100;
        int num2=500;
        int num3=110;

        if(num1>num2){
            if(num1>num3){
                System.out.println("num1 is largest "+num1);
            }else{
                System.out.println("num3 is largest "+num3);
            }
        }else{

            if(num2>num3){
                System.out.println("num2 is largest "+num2);
            }else{
                System.out.println("num3 is largest "+num3);
            }
        }


    }
}
