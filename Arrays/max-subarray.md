Maximum Subarray Using Kadane’s Algorithm
📌 Problem Statement

Given an integer array nums, find the contiguous subarray with the largest sum and return that sum.

A subarray is a continuous part of the array.

💡 Approach (Kadane’s Algorithm)

We use two variables:

currentSum → Stores the current subarray sum
maxSum → Stores the maximum sum found so far
Steps:
Start with the first element.
Traverse the array from left to right.
At each element:
Either start a new subarray
Or continue the existing subarray
Update the maximum sum whenever a larger sum is found.

Kadane’s Algorithm works efficiently in a single traversal.

🧠 Example
Input
nums = [-2, -3, 4, -1, -2, 1, 5, -3]
Output
7
Explanation

The subarray:

[4, -1, -2, 1, 5]

has the maximum sum:

4 + (-1) + (-2) + 1 + 5 = 7
💻 Java Code
import java.util.*;

class Solution {

    // Function to find maximum subarray sum
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Choose maximum between current element
            // and current element + previous sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
⏱ Time Complexity
O(n) → Traverse the array once.
📦 Space Complexity
O(1) → Constant extra space used.
❓ Why Kadane’s Algorithm?

A brute-force solution checks all possible subarrays:

O(n²)

Kadane’s Algorithm optimizes this to:

O(n)

making it the best solution for this problem.

✅ Key Points
Best known solution for Maximum Subarray problem.
Uses dynamic programming concept.
Works in a single traversal.
Frequently asked in coding interviews and online coding platforms.
