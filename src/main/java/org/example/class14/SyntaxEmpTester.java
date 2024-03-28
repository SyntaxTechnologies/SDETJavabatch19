package org.example.class14;

public class SyntaxEmpTester {
    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID=12445;
        emp1.salary=25000;
        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(emp1.ceo);

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID=452445;
        emp2.salary=15000;
        System.out.println(emp2.empID);
        System.out.println(emp2.salary);
        System.out.println(emp2.ceo);
    }
}

