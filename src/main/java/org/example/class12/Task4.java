package org.example.class12;

/*
How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
 */
public class Task4 {
    public static void main(String[] args) {

        String str="This is sentence i want to reverse";
        String[] strArray=str.split(" ");
        for (String s:strArray){
            StringBuilder st=new StringBuilder(s);
            st.reverse();
            System.out.print(st+" ");
        }
    }
}
