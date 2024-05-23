package com.conditionalStatements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if - else
        // Print the largest of 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        if(a > b){
            System.out.println(a + " is greater than " + b);
        }
        else{
            System.out.println(b + " is greater than " + a);
        }
    }
}
