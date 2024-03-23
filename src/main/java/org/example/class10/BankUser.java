package org.example.class10;

public class BankUser {
    String fullName;
    double accountBalance;
    String userName;
    String password;
    int age;
    boolean isSavingsAccount;

   public void deposit(){
        System.out.println("Depositing funds");
    }

    void transferFunds(){
        System.out.println("Sending money to other account");
    }

    void withdraw(){
        System.out.println("withdrawing funds.....");
    }

}
