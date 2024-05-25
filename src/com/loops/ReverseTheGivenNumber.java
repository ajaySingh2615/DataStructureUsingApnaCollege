package com.loops;

public class ReverseTheGivenNumber {
    public static void main(String[] args) {
        var n = 10899;

        while (n != 0) {
            var rem = n % 10;
            System.out.print(rem);
            n/=10;
        }
    }
}
