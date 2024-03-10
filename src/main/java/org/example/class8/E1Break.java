package org.example.class8;

public class E1Break {
    public static void main(String[] args) {

        String [] names={"James","Iram","Matt Naughty","ubaidur","Aladin","Ana","Silvia"};
        // search for the name Iram if it is present print on the console name is present

        for(String n:names){

            if(n.equals("James")){
                System.out.println(n+" is present");
            break;
            }
            // Break till 11:53

        }
    }
}
