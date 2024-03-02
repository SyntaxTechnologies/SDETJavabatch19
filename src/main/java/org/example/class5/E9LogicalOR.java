package org.example.class5;

public class E9LogicalOR {
    public static void main(String[] args) {

        double bankBalance=20000;
        double cash=40000;

        if(bankBalance>30000||cash>30000){
            System.out.println("I can go buy a Toyota Corolla");
        }else{
            System.out.println("I need to save more");
        }
    }
}
