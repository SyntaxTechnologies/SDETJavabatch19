package org.example.class3;
/*
Create a Java program and name it Temperature Check.
Create variable to store temperature. Your program
should check if temperature is below 32 then it should
print “Water will freeze with temperature __”, otherwise
“Water will NOT freeze with temperature __”.
 */
public class Task5 {
    public static void main(String[] args) {

        double temp=40;
        if(temp<32)
            System.out.println("The water will freeze with temperature "+temp);
        else{
            System.out.println("The water will NOT freeze with temperature "+temp);
        }
    }
}
