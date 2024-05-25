package com.loops;

public class ReverseNumber {
    public static void main(String[] args) {
        var n = 10899;
        var reverseNumber = 0;

        while (n != 0){
            var lastDigit = n % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            n/=10;
        }

        System.out.println("reverseNumber = " + reverseNumber);
    }
}
