package org.example.class13;

/*
Create a method that will say Hello in different language
based on the country name that will be passed when method is executed.
Do it for any five countries
 */
public class E1Methods {


    void sayHello(String country){

        switch (country){
            case "USA":
                System.out.println("Hello");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Egypt":
                System.out.println("Marhaba");
                break;
            case "Serbia":
                System.out.println("Zdravo");
                break;
            case "Spain":
                System.out.println("Halo");
                break;
            default:
                System.out.println("Country not supported");
        }
    }
    //break till 7:57


    public static void main(String[] args) {
        E1Methods e1=new E1Methods();
        e1.sayHello("Serbia");

    }


}
