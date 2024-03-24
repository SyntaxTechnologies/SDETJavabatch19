package org.example.class12;
/*
How would you check if String is palindrome or not? aba=> true
Abbc =>false

 */
public class Task5 {
    public static void main(String[] args) {

        String originalStr="aba";
        StringBuilder st=new StringBuilder(originalStr);
        st.reverse();
        String reversedStr=st.toString();
        if(originalStr.equals(reversedStr)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }




    }
}
