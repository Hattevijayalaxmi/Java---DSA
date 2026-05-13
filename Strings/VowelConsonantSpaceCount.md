# Count Vowels, Consonants, and Spaces

## 📌 Problem Statement

Given a sentence, count the number of:
- Vowels
- Consonants
- Spaces

present in the string.

---

## 💡 Approach

We traverse each character of the string and classify it as:
- Vowel
- Consonant
- Space

### Steps:
1. Convert the string to lowercase.
2. Store vowels in a list.
3. Traverse each character:
   - If character is a vowel → increase vowel count
   - If character is a space → increase space count
   - If character is a letter but not a vowel → increase consonant count
4. Print all counts.

---

## 🧠 Example

### Input
```text
Hello World
```

### Output
```text
vowels count=3 consonants count=7 Space count=1
```

---

## 💻 Java Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelConsonantSpaceCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the sentence:");

        String s = sc.nextLine();

        // Convert to lowercase
        s = s.toLowerCase();

        // List of vowels
        List<Character> vowels =
            Arrays.asList('a', 'e', 'i', 'o', 'u');

        int vowelscount = 0;
        int consonantcount = 0;
        int spacecount = 0;

        // Traverse each character
        for (char c : s.toCharArray()) {

            if (vowels.contains(c)) {

                vowelscount++;

            } else if (c == ' ') {

                spacecount++;

            } else if (
                Character.isLetter(c)
                && !vowels.contains(c)
            ) {

                consonantcount++;
            }
        }

        // Print counts
        System.out.println(
            "vowels count=" + vowelscount
            + " consonants count=" + consonantcount
            + " Space count=" + spacecount
        );

        sc.close();
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

- Uses character classification
- Handles vowels, consonants, and spaces separately
- Beginner-friendly string problem
- Uses built-in Java methods for checking letters
- 
