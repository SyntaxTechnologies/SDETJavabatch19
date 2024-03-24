package org.example.class12;

public class E3String {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder("Sunday7343Monday");
        // only deletes one character
       // st.deleteCharAt(6);
        // deletes a range of characters.
        st.delete(6,10);
        System.out.println(st);





    }
}
