package org.example.class11;

public class E12String {
    public static void main(String[] args) {
        String str="kdfjhfsHBFJHDF9843894y!@@##";
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9]",""));


    }
}
