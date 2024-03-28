package org.example.class14;

public class E1LocalVariables {
    //instance variable
    String name;
    //instance variable
    int age;
    //static variable
    static double gravity=9.8;

    //local variable
    int add(int a, int b){
        System.out.println(name);
        return a+b;
    }
    //local variable
    void printNumber(int number){
        System.out.println(name);
        if(number>10){
            System.out.println(name);
            //local variable
            int sum=30;
            System.out.println(sum);
        }


       // System.out.println(sum);
    }

    public static void main(String[] args) {
        //local variable
        int sum=30;
        //local variable
        int base=sum+45;

        System.out.println(base);
    }
}
