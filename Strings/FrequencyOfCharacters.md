# Frequency of Characters in a String

## 📌 Problem Statement

Given a string, count the frequency of each character present in the string.

---

## 💡 Approach (Using HashMap)

We use a `HashMap<Character, Integer>` to store the frequency of each character.

### Steps:
1. Take string input from the user.
2. Traverse each character of the string.
3. Check if the character already exists in the HashMap:
   - If yes → increase its frequency
   - If no → add it with frequency `1`
4. Print all characters with their frequencies.

---

## 🧠 Example

### Input
```text
hello
```

### Output
```text
h : 1
e : 1
l : 2
o : 1
```

---

## 💻 Java Code

```java
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");

        String str = sc.nextLine();

        // Create HashMap to store frequency
        HashMap<Character, Integer> map = new HashMap<>();

        // Traverse string
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Update frequency
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print frequencies
        System.out.println("Character Frequencies:");

        for (char key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        sc.close();
    }
}
```

---

## ⏱ Time Complexity

- **O(n)** → Traverse the string once.

---

## 📦 Space Complexity

- **O(n)** → Extra space used for HashMap.

---

## ✅ Key Points

- Uses HashMap for frequency counting
- Efficient linear-time solution
- Works for all characters
- Common interview string problem
