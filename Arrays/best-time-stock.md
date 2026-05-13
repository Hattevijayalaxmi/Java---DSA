# Best Time to Buy and Sell Stock

## 📌 Problem Statement

Given an array `prices` where `prices[i]` is the price of a stock on the `i-th` day, find the maximum profit you can achieve.

You can buy and sell the stock only once.

Return the maximum profit possible.

---

## 💡 Approach

We keep track of:

- `minPrice` → Minimum stock price seen so far
- `maxProfit` → Maximum profit found so far

### Steps:
1. Traverse the array.
2. Update the minimum buying price.
3. Calculate profit for the current day.
4. Update maximum profit if a larger profit is found.

This gives the optimal solution in a single traversal.

---

## 🧠 Example

### Input
```text
prices = [7, 1, 5, 3, 6, 4]
```

### Output
```text
5
```

### Explanation
```text
Buy at price 1 and sell at price 6
Profit = 6 - 1 = 5
```

---

## 💻 Java Code

```java
import java.util.*;

class Solution {

    // Function to find maximum profit
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            // Update minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
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

## ✅ Key Points

- Efficient one-pass solution
- Tracks minimum buying price dynamically
- Common coding interview problem
- Better than brute-force approach

---

## ❓ Why This Approach?

A brute-force solution checks all buy-sell pairs:

```text
O(n²)
```

This optimized approach reduces it to:

```text
O(n)
```

by keeping track of the minimum price while traversing the array.
