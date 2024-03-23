package org.example.class11;

public class E1String {

    public static void main(String[] args) {

            /*
            We are creating the object of the String class
            and storing that object in the str variable
             */
        String str=new String("Today ");
        /*
        we are calling the length method from the String class
        using its object "str" this method is returning the number of
        characters which we are storing in len variable
         */
       int len= str.length();
        System.out.println(len);
        System.out.println(str.length());

        if(len>4){
            System.out.println("String is too long");
        }



    }
}
