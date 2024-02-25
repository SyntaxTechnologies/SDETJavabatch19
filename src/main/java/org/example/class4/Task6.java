package org.example.class4;
/*
. Create a Java program and call it a Donor.
In order to be eligible to donate your blood you have to
be 18 years old. Also once you identify age eligibility then we
have to see if person matches weight requirements. If person weight is
more than 110 lbs → then he/she is eligible, otherwise we cannot accept
such a patient.

 */
public class Task6 {
    public static void main(String[] args) {
        int age=20;
        double weight=130;

        if(age>=18){

            if(weight>110){
                System.out.println("Eligible");
            }else{
                System.out.println("we cannot accept such a patient");
            }
        }else{
            System.out.println("we cannot accept such a patient");
        }

    }
}
