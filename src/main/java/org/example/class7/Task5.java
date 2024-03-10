package org.example.class7;

public class Task5 {
    public static void main(String[] args) {
        char[] word={'S','U','N','D','A','Y'};
        // 0 1 2 3 4 5
        // 5 4 3 2 1 0
        for(int i=word.length-1; i>=0;i--){
            System.out.println(word[i]);
        }
    }

}
