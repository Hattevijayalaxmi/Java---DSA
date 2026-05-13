# Smallest Element in an Array

## 📌 Problem Statement

Given an array of integers, find the smallest element present in the array.

---

## 💡 Approach (Using Sorting)

We sort the array in ascending order using `Arrays.sort()`.

After sorting:
- The first element of the array becomes the smallest element.

### Steps:
1. Sort the array.
2. Return the first element.

---

## 🧠 Example

### Input
```text
arr = [2, 5, 1, 3, 0]
```

### Output
```text
0
```

### Explanation
```text
After sorting:
[0, 1, 2, 3, 5]

The first element is the smallest element.
```

---

## 💻 Java Code

```java
import java.util.Arrays;

class Solution {

    // Function to sort the array and return the smallest element
    public static int sortArr(int[] arr) {

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the first element
        return arr[0];
    }
}

public class Main {

    public static void main(String[] args) {

        // Array
        int[] arr1 = {2, 5, 1, 3, 0};

        System.out.println(
            "The smallest element in the array is: "+ Solution.sortArr(arr1)
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
- Simple and beginner-friendly approach
- First element becomes the smallest after sorting
- Less efficient than linear traversal approach
