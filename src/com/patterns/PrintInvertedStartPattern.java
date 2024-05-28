package com.patterns;

public class PrintInvertedStartPattern {
    public static void main(String[] args) {
        int n = 4;

        //outer loop
        for (int i = 0; i < n; i++) {
            //inner loop
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
