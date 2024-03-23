package org.example.class11;
/*
Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL

 */
public class Task4 {
    public static void main(String[] args) {
        String fatherName="Matt";
        String motherName="Taylor";
        boolean isBoy=false;
        if(isBoy){
            String firstHalf=fatherName.substring(0,fatherName.length()/2);
            String lastHalf=motherName.substring(motherName.length()/2,motherName.length());
            System.out.println(firstHalf+lastHalf);
        }else{
            String firstHalf=motherName.substring(0,motherName.length()/2);
            String lastHalf=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(firstHalf+lastHalf);
        }

    }
}
