package com.arrayparttwo;

public class Main {
    public static void main(String[] args) {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        printMaxSubArraySumUsingKadaneAlgorithm(arr);

    }

    // Kadane's Algorithm (To find max subarray sum)
    public static void printMaxSubArraySumUsingKadaneAlgorithm(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Maximum sum is : " + maxSum);
    }

    //prefix sum
    public static void printMaxSubArraySumUsingPrefixSum(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        //calculate prefix array
        prefix[0] = arr[0];
        for(int i=1; i< prefix.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] :  prefix[end] - prefix[start - 1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is " + maxSum);
    }
    // max sub-array sum
    public static void printMaxSubArraySum(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k < end; k++) {
                    //subarray sum
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is " + maxSum);
    }
}
