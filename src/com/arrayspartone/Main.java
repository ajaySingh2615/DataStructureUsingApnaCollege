package com.arrayspartone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        printSubArrays(arr);
    }

    //print subArrays
    public static void printSubArrays(int[] arr) {
        int ts = 0;
        int sum = 0;
        int maximumNumber = Integer.MIN_VALUE;
        int minimumNumber = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    sum += arr[k];
                }
                ts++;
                System.out.print(" sum is : " + sum);
                if(sum > maximumNumber){
                    maximumNumber = sum;
                }
                if(sum < minimumNumber){
                    minimumNumber = sum;
                }
                sum = 0;

                System.out.println();

            }
            System.out.println();
        }

        System.out.println("Maximum number " + maximumNumber);
        System.out.println("Minimum number " + minimumNumber);
        System.out.println("Total subArrays " + ts);
    }

    //pairs in array
    public static void pairsInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " ," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    //reverse an array
    public static void reverseAnArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }

    //Binary Search
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    //largest number
    public static int largestNumber(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    //Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
