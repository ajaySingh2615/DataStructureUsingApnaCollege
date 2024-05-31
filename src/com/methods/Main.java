package com.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var num = 5;
        decTOBin(num);
    }

    // convert from decimal to binary
    public static void decTOBin(int num){
        int bin = 0;
        int pow = 0;

        while (num > 0){
            int rem = num % 2;
            bin += (int) (rem * Math.pow(10, pow)); ;

            pow++;
            num /=2;
        }

        System.out.println("Decimal: " + bin);
    }

    // convert from binary to decimal
    public static int binToDec(int num){
        int dec = 0;
        int pow = 0;

        while (num > 0){
            int lastDigit = num % 10;
            dec = (int) (dec + (lastDigit * Math.pow(2, pow)));
            pow++;
            num /= 10;
        }

        return dec;
    }

    // check all prime numbers in range
    public static void primeNumbersInRange(int num){
        for (int i = 1; i <= num; i++) {
            if(isPrime(i)){
                System.out.println(i + " is a prime number");
            }else{
                System.out.println(i + " is not a prime number");
            }
        }
    }

    // check if number is prime or not
    public static boolean isPrime(int num){
        boolean prime = true;
        if(num == 0 || num == 1){
            prime = false;
        }else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    // find binomial coefficient of a given n, r
    public static double binomialCoefficient(int n, int r){
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nMinusR = factorial(n- r);

        return (double) nFactorial / (rFactorial*(nMinusR));
    }

    // find factorial of a given number
    public static int factorial(int a){
        int fact = 1;
        while (a != 0){
            fact *= a;
            a--;
        }
        return fact;
    }

    // find product of a and b
    public static int productOfTwoNumbers(int a, int b){
        return a * b;
    }
}
