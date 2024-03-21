package org.example.class10;

public class BankUserTester {
    public static void main(String[] args) {
        BankUser mattObj=new BankUser();
        mattObj.fullName="Matt";
        mattObj.age=30;
        mattObj.isSavingsAccount=false;
        mattObj.accountBalance=300000;
        mattObj.userName="Biden123";
        mattObj.password="Pass123";
        System.out.println(mattObj.fullName);
        System.out.println(mattObj.age);
        System.out.println(mattObj.accountBalance);
        System.out.println(mattObj.fullName);
        mattObj.deposit();
        mattObj.transferFunds();

    }
}
