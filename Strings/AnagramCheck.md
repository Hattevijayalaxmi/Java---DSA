# Anagram Check Using HashMap

## 📌 Problem Statement

Given two strings, check whether they are anagrams of each other.

Two strings are called anagrams if they contain the same characters with the same frequency.

---

## 💡 Approach (Using HashMap)

We use a `HashMap<Character, Integer>` to store the frequency of characters.

### Steps:
1. Traverse the first string and store character frequencies in the HashMap.
2. Traverse the second string:
   - If a character does not exist in the map → not an anagram.
   - Otherwise decrease its frequency.
3. Remove characters whose frequency becomes `0`.
4. If the map becomes empty at the end, both strings are anagrams.

---

## 🧠 Example

### Input
```text
word1 = listen
word2 = silent
```

### Output
```text
kudos ! they are anagrams
```

---

## 💻 Java Code

```java
import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter word1:");
        String s1 = sc.nextLine();

        System.out.println("enter word2:");
        String s2 = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of characters from first string
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean flag = false;

        // Remove characters using second string
        for (char c : s2.toCharArray()) {

            if (!map.containsKey(c)) {
                flag = true;
            } else {

                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }

        // Check result
        if (!flag && map.isEmpty()) {
            System.out.println("kudos ! they are anagrams");
        } else {
            System.out.println("they are not anagrams.");
        }

        sc.close();
    }
}
```

---

## ⏱ Time Complexity

- **O(n)** → Traverse both strings once.

---

## 📦 Space Complexity

- **O(n)** → Extra space used for HashMap.

---

## ✅ Key Points

- Uses HashMap for character frequency counting
- Efficient linear-time solution
- Better than sorting approach for large strings
- Common interview coding problem
