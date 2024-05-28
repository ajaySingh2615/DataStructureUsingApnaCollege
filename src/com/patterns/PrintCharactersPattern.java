package com.patterns;

public class PrintCharactersPattern {
    public static void main(String[] args) {
        int n = 4;

        char ch = 'A';

        //outer loop
        for(int i=0; i<n; i++){
            //inner loop
            for(int j=0; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
