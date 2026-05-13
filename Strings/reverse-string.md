# Reverse String

## 📌 Problem Statement

Given a string, reverse the string and return the reversed result.

---

## 💡 Approach

We traverse the string from the last character to the first character and build a new reversed string.

### Steps:
1. Start traversing from the end of the string.
2. Append each character to a new string.
3. Return the reversed string.

---

## 🧠 Example

### Input
```text
hello
```

### Output
```text
olleh
```

---

## 💻 Java Code

```java
import java.util.*;

class Solution {

    // Function to reverse a string
    public String reverseString(String str) {

        String reversed = "";

        // Traverse string from end to beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        String str = sc.nextLine();

        // Create Solution object
        Solution sol = new Solution();

        // Print reversed string
        System.out.println(sol.reverseString(str));

        sc.close();
    }
}
```

---

## ⏱ Time Complexity

- **O(n)** → Traverse the string once.

---

## 📦 Space Complexity

- **O(n)** → Extra space used for reversed string.

---

## ✅ Key Points

- Simple and beginner-friendly approach
- Uses string traversal
- Common interview question
- Can also be solved using StringBuilder
