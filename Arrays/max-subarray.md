Maximum Subarray Problem
Problem Statement

Given an array of integers, find the contiguous subarray with the largest sum and return its sum.

This problem is commonly solved using Kadane’s Algorithm.

Approach

We use two variables:

currentSum → stores the current subarray sum
maxSum → stores the maximum sum found so far

At each element:

Either start a new subarray from the current element
Or continue the existing subarray

import java.util.*;

public class Main {

    // Function to find maximum subarray sum
    public static int maxSubArray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output maximum subarray sum
        System.out.println(maxSubArray(arr));

        sc.close();
    }
}

Sample Input
8
-2 -3 4 -1 -2 1 5 -3
Sample Output
7

Explanation
The subarray:
4 -1 -2 1 5
has the maximum sum:
4 + (-1) + (-2) + 1 + 5 = 7

Time Complexity
O(n) → We traverse the array once.


Space Complexity
O(1) → Constant extra space used.

