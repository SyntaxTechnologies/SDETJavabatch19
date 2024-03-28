package org.example.class14;

public class StudentsTester {
    public static void main(String[] args) {
        Students st1 = new Students();
        st1.name = "Anna";
        st1.id = 267222;
        Students.numStudents ++ ;

        System.out.println(st1.name);
        System.out.println(st1.id);
        Students st2 = new Students();
        st2.name = "Ken";
        st2.id = 7643;
        Students.numStudents ++ ;

        System.out.println(st2.name);
        System.out.println(st2.id);
        System.out.println(Students.numStudents);
    }
}