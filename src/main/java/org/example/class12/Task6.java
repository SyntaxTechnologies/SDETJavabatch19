package org.example.class12;

/*
Create a method that will take 2 parameters as a
numbers and prints which number is larger.
 */
public class Task6 {

    void printLarger(int a,int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    void printEvenOdd(int num){

        if(num%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }

    void isPalindrome(String originalStr){
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
