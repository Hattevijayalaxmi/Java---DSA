# TWO SUM USING HASHMAP

## 📌 Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

You may assume that each input has exactly one solution, and you cannot use the same element twice.

---

## 💡 Approach (Using HashMap)

* Use a HashMap to store elements:

  * **Key = number**
  * **Value = index**
* While iterating through the array:

  1. Calculate `diff = target - nums[i]`
  2. Check if `diff` exists in the map

     * If yes → solution found
  3. If not → store the current element in the map

---

## 🧠 Example

```
Input: nums = [2, 7, 11, 15], target = 9  
Output: [0, 1]
```

---

## 💻 Code (Java)

```Below is the optimized Java solution using HashMap:
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## ⏱ Time Complexity

* O(n) → traverse the array once

## 📦 Space Complexity

* O(n) → extra space for HashMap

---

## ✅ Key Points

* Brute force approach takes O(n²)
* HashMap gives optimal solution
* Very common interview question
