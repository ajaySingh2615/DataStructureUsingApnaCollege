package com.loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to check if it is prime or not?");
        var num = scanner.nextInt();

        var isPrime = true;

        for(int i=2; i<Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
        scanner.close();
    }
}
