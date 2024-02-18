package org.example.class2;

import javax.naming.Name;

/*
Change student’s city, state, phone number. And print those updated values:
Example:
My name is __ and I moved to new city__ and new state__. My new phone number is ___

 */
public class T2 {
    public static void main(String[] args) {

        String firstName="James";
        String lastName="Bond";
        String city="New York";
        String state="New York";
        String phoneNumber="911";
        System.out.println("My First name is "+firstName+" and my  last name is "+lastName);
        System.out.println("I live in city "+city+" and state "+state);
        System.out.println("And my phone number is "+phoneNumber);
        city="Virginia";
        state="TX";
        phoneNumber="+12548524584";
        System.out.println("My name is "+ firstName+" and I moved to new city "+city+" and new state"+state+" My new phone number is"+phoneNumber);

    }
}
