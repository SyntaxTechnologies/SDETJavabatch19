package org.example.class11;

public class E7String {
    /*
    count how many times the letter t has appeared in the String
     */
    public static void main(String[] args) {
        String str="Matt is going to regret soon";
       // System.out.println(str.charAt(3));
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='t'||str.charAt(i)=='T'){
                count++;
            }
        }

        System.out.println(count);




    }
}
