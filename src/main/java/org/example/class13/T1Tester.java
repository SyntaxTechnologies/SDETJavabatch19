package org.example.class13;

public class T1Tester {
    public static void main(String[] args) {

        Task1 t1=new Task1();
     String email=  t1.createEmail("John","Snow","Gmail");
     if(email.contains("John")){
         System.out.println("Good");
     }

    }
}
