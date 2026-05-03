# Two Sum

## 📌 Problem Statement

Given an array of integers 'nums' and an integer 'target' , return the indices of the two numbers such that they add up to the target.

You may assume that each input has exactly one solution, and you cannot use the same element twice.

---

## 💡 Approach (Using HashMap)

* Ek HashMap use karte hain jisme:

  * **key = number**
  * **value = index**
* Array ko iterate karte waqt:

  1. Current element ke liye 'diff = target - nums[i]' calculate karte hain
  2. Check karte hain ki 'diff' already map me hai ya nahi

     * Agar hai → answer mil gaya
  3. Agar nahi hai → current element ko map me store kar dete hain

---

## 🧠 Example

```
Input: nums = [2, 7, 11, 15], target = 9

Step 1:
i = 0 → num = 2 → diff = 7 → map = {}

Step 2:
i = 1 → num = 7 → diff = 2 → map me 2 present hai

Output: [0, 1]
```

---

## ⏱ Time Complexity

* O(n) → array ko ek hi baar traverse karte hain

## 📦 Space Complexity

* O(n) → HashMap me elements store hote hain

---

## ✅ Key Points

* Brute force O(n²) hota hai (avoid karo)
* HashMap se optimal solution milta hai
* Interview me yeh bahut common question hai
