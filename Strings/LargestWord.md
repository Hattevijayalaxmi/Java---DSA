# Largest Word in a String

## 📌 Problem Statement

Given a sentence, find the largest word present in the string.

---

## 💡 Approach

We traverse the string and calculate the length of each word.

### Steps:
1. Initialize two pointers:
   - `i` → start of the current word
   - `j` → traverses the string
2. Traverse the string character by character.
3. When a space or end of string is found:
   - Calculate current word length
   - Compare it with the maximum length
4. Store the starting position of the largest word.
5. Return the largest word using `substring()`.

---

## 🧠 Example

### Input
```text
Google Docs
```

### Output
```text
Google
```

### Explanation
```text
"Google" has more characters than "Docs".
```

---

## 💻 Java Code

```java
public class LargestWord {

    static String maxLength(String str) {

        int len = str.length();

        int i = 0, j = 0;

        String maxWord = "";

        int max_length = 0, max_start = 0;

        while (j <= len) {

            if (j < len && str.charAt(j) != ' ') {

                j++;

            } else {

                int curr_length = j - i;

                if (curr_length > max_length) {

                    max_length = curr_length;

                    max_start = i;
                }

                j++;

                i = j;
            }
        }

        maxWord = str.substring(
            max_start,
            max_start + max_length
        );

        return maxWord;
    }

    public static void main(String[] args) {

        String str = "Google Docs";

        System.out.print(
            "Largest Word is: " + maxLength(str)
        );
    }
}
```

---

## ⏱ Time Complexity

- **O(n)** → Traverse the string once.

---

## 📦 Space Complexity

- **O(1)** → Constant extra space used.

---

## ✅ Key Points

- Uses two-pointer technique
- Efficient single traversal solution
- Finds longest word in a sentence
- Beginner-friendly string problem
