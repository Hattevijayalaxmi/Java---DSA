# Maximum Subarray Using Kadane’s Algorithm

## 📌 Problem Statement

Given an integer array `nums`, find the contiguous subarray with the largest sum and return that sum.

A subarray is a continuous part of the array.

---

## 💡 Approach (Kadane’s Algorithm)

We use two variables:

- `currentSum` → Stores the current subarray sum
- `maxSum` → Stores the maximum sum found so far

### Steps:
1. Start with the first element.
2. Traverse the array from left to right.
3. At each element:
   - Either start a new subarray
   - Or continue the existing subarray
4. Update the maximum sum whenever a larger sum is found.

Kadane’s Algorithm works efficiently in a single traversal.

---

## 🧠 Example

### Input
```text
nums = [-2, -3, 4, -1, -2, 1, 5, -3]
```

### Output
```text
7
```

### Explanation

The subarray:

```text
[4, -1, -2, 1, 5]
```

has the maximum sum:

```text
4 + (-1) + (-2) + 1 + 5 = 7
```

---

## 💻 Java Code

```java
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
```

---

## ⏱ Time Complexity

- **O(n)** → Traverse the array once.

---

## 📦 Space Complexity

- **O(1)** → Constant extra space used.

---

## ❓ Why Kadane’s Algorithm?

A brute-force solution checks all possible subarrays:

```text
O(n²)
```

Kadane’s Algorithm optimizes this to:

```text
O(n)
```

making it the best solution for this problem.

---

## ✅ Key Points

- Best known solution for Maximum Subarray problem
- Uses dynamic programming concept
- Works in a single traversal
- Frequently asked in coding interviews and coding platforms
