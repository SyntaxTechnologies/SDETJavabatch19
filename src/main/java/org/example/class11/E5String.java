package org.example.class11;

public class E5String {

    public static void main(String[] args) {


       // String str=new String("Java is Easy");
        String st="Matt like WaterMelon. He is again in the kitchen";
        System.out.println(st.contains("Viet"));
        System.out.println(st.contains("Matt like WaterMelon"));

        System.out.println( st.toLowerCase().contains("matt like watermelon"));
        System.out.println(st.startsWith("M"));
        System.out.println(st.endsWith("again"));
        boolean ends= st.endsWith("again");
        System.out.println(ends);





    }
}
