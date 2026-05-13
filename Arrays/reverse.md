# Reverse an Array

## 📌 Problem Statement

Given an array of integers, reverse the array in-place.

The reversal should be done without using extra space.

---

## 💡 Approach (Two Pointer Method)

We use two pointers:

- `p1` → Starts from the beginning of the array
- `p2` → Starts from the end of the array

### Steps:
1. Swap elements at `p1` and `p2`.
2. Move `p1` one step forward.
3. Move `p2` one step backward.
4. Continue until both pointers meet.

This efficiently reverses the array in-place.

---

## 🧠 Example

### Input
```text
arr = [1, 2, 3, 4, 5]
```

### Output
```text
5 4 3 2 1
```

---

## 💻 Java Code

```java
import java.util.*;

class Solution {

    // Function to reverse the array in-place
    public void reverseArray(int[] arr) {

        // Pointer at beginning
        int p1 = 0;

        // Pointer at end
        int p2 = arr.length - 1;

        // Swap elements until pointers meet
        while (p1 < p2) {

            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
    }
}

// Driver code
class Main {

    public static void main(String[] args) {

        // Create Solution object
        Solution sol = new Solution();

        // Input array
        int[] arr = {1, 2, 3, 4, 5};

        // Reverse the array
        sol.reverseArray(arr);

        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

## ⏱ Time Complexity

- **O(n)** → Traverse half of the array.

---

## 📦 Space Complexity

- **O(1)** → No extra space used.

---

## ✅ Key Points

- Uses two-pointer technique
- In-place array reversal
- No extra array required
- Efficient and beginner-friendly approach
