package com.patterns;

public class PrintHalfPyramidPattern {
    public static void main(String[] args) {
        int n = 4;

        //outer loop
        for(int i=0; i<n; i++){
            //inner loop
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
