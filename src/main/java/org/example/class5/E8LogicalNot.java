package org.example.class5;

public class E8LogicalNot {
    public static void main(String[] args) {

        boolean box=false;
        box=!box;
        System.out.println(box);

        String country="Iran";
        if(!country.equals("Iran")){
            System.out.println("You can visit USA");
        }else{
            System.out.println("Not Allowed");
        }

    }
}
