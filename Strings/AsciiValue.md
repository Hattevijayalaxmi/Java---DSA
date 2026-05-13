# ASCII Value of a Character

## 📌 Problem Statement

Given a character, find and print its ASCII value.

---

## 💡 Approach

In Java, every character is internally stored as an integer value based on the ASCII/Unicode table.

We can directly assign a character to an integer variable to get its ASCII value.

### Steps:
1. Take a character input from the user.
2. Store the character in a variable.
3. Assign the character to an integer variable.
4. Print the ASCII value.

---

## 🧠 Example

### Input
```text
A
```

### Output
```text
65
```

### Explanation
```text
The ASCII value of character 'A' is 65.
```

---

## 💻 Java Code

```java

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character:");
        char c = sc.next().charAt(0);
        int ascii = c;
        System.out.println("the ascii value of the character is " + ascii);
        sc.close();
    }

}
```

---

## ⏱ Time Complexity

- **O(1)** → Constant time operation.

---

## 📦 Space Complexity

- **O(1)** → No extra space used.

---

## ✅ Key Points

- Characters can be directly converted into integers
- Uses ASCII/Unicode representation
- Beginner-friendly Java program
- Common basic programming problem
