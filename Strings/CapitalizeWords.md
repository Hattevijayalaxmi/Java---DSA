# Capitalize First and Last Character of Each Word

## 📌 Problem Statement

Given a string, capitalize the first and last character of every word in the sentence.

---

## 💡 Approach

We split the sentence into words and process each word individually.

### Steps:
1. Take input string from the user.
2. Split the string into words using spaces.
3. For each word:
   - Convert the first character to uppercase.
   - Convert the last character to uppercase.
4. Append the modified word to the result string.
5. Print the final result.

---

## 🧠 Example

### Input
```text
hello world
```

### Output
```text
HellO WorlD
```

### Explanation
```text
First and last characters of each word
are converted to uppercase.
```

---

## 💻 Java Code

```java
import java.util.Scanner;

public class CapitalizeWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        String result = capitalizeWords(input);

        System.out.println("Result: " + result);

        scanner.close();
    }

    private static String capitalizeWords(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();

        String[] words = input.split("\\s+");

        for (String word : words) {

            if (word.length() > 1) {

                char firstChar =
                    Character.toUpperCase(word.charAt(0));

                char lastChar =
                    Character.toUpperCase(
                        word.charAt(word.length() - 1)
                    );

                result.append(firstChar)
                      .append(word.substring(1, word.length() - 1))
                      .append(lastChar)
                      .append(" ");

            } else {

                result.append(
                    Character.toUpperCase(word.charAt(0))
                ).append(" ");
            }
        }

        return result.toString().trim();
    }
}
```

---

## ⏱ Time Complexity

- **O(n)** → Traverse all characters once.

---

## 📦 Space Complexity

- **O(n)** → Extra space used for result string.

---

## ✅ Key Points

- Uses StringBuilder for efficient string operations
- Handles multiple words
- Works for single-character words
- Beginner-friendly string manipulation problem
