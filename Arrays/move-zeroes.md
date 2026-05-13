# Move Zeroes

## 📌 Problem Statement

Given an integer array `nums`, move all `0`s to the end while maintaining the relative order of the non-zero elements.

You must do this in-place without making a copy of the array.

---

## 💡 Approach

We use an `index` variable to keep track of the position where the next non-zero element should be placed.

### Steps:
1. Traverse the array.
2. If the current element is non-zero:
   - Place it at `index`
   - Increment `index`
3. After all non-zero elements are placed,
   fill the remaining positions with `0`.

This approach maintains the order of non-zero elements.

---

## 🧠 Example

### Input
```text
nums = [0, 1, 0, 3, 12]
```

### Output
```text
[1, 3, 12, 0, 0]
```

---

## 💻 Java Code

```java
import java.util.*;

class Solution {

    // Function to move all zeroes to the end
    public void moveZeroes(int[] nums) {

        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with zeroes
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
```

---

## ⏱ Time Complexity

- **O(n)** → Traverse the array once.

---

## 📦 Space Complexity

- **O(1)** → No extra space used.

---

## ✅ Key Points

- Maintains relative order of non-zero elements
- In-place solution
- Efficient single traversal approach
- Common interview coding problem
