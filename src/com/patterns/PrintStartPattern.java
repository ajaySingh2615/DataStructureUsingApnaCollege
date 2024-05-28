package com.patterns;

public class PrintStartPattern {
    public static void main(String[] args) {

        var n = 4;

        //outer loop
        for (var i = 0; i < n; i++) {
            //inner loop
            for(var j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
