package com.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to print:");
        int num = scanner.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum is : " + sum);
        scanner.close();
        */

        //print square pattern
        var side = 4;

        for(var i=1; i<=side; i++){
            System.out.println("****");
        }
    }
}
