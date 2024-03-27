package org.example.class13;

/*
Create a method createEmail(). Based on values of users firstName,
lastName and email type, your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 */
public class Task1 {
    String createEmail(String firstName,String lastName,String emailType){
        String email=firstName+lastName+"@"+emailType+".com";
        return email;
    }

  /*  void createEmail(String firstName,String lastName,String emailType){
        String email=firstName+lastName+"@"+emailType+".com";
        System.out.println(email);
    }*/
}
