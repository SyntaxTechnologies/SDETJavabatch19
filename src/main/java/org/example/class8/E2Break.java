package org.example.class8;

public class E2Break {
    public static void main(String[] args) {


        int [] numbers={10,60,30,55,45,35,50,100};

        for(int num:numbers){
            if(num>50){
            continue;
            }
            System.out.println(num+10);
            System.out.println(num*10);
            System.out.println(num/10);
            System.out.println(num%10);
            System.out.println(num*20);
            System.out.println("****");
        }


    }
}
