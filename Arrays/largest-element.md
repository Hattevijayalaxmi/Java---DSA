# Largest Element in an Array

## 📌 Problem Statement

Given an array of integers, find the largest element present in the array.

---

## 💡 Approach (Using Sorting)

We sort the array in ascending order using `Arrays.sort()`.

After sorting:
- The last element of the array becomes the largest element.

### Steps:
1. Sort the array.
2. Return the last element.

---

## 🧠 Example

### Input
```text
arr = [2, 5, 1, 3, 0]
```

### Output
```text
5
```

### Explanation
```text
After sorting:
[0, 1, 2, 3, 5]

The last element is the largest element.
```

---

## 💻 Java Code

```java
import java.util.Arrays;

class Solution {

    // Function to sort the array and return the largest element
    public static int sortArr(int[] arr) {

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the last element
        return arr[arr.length - 1];
    }
}

public class Main {

    public static void main(String[] args) {

        // Initialize arrays
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};

        // Find and print largest element
        System.out.println(
            "The Largest element in the array is: "+ Solution.sortArr(arr1)
        );

        System.out.println(
            "The Largest element in the array is: "+ Solution.sortArr(arr2)
        );
    }
}
```

---

## ⏱ Time Complexity

- **O(n log n)** → Due to sorting.

---

## 📦 Space Complexity

- **O(1)** → No extra space used.

---

## ✅ Key Points

- Uses built-in sorting method
- Easy and beginner-friendly approach
- Last element becomes the largest after sorting
- Less efficient than linear traversal approach
