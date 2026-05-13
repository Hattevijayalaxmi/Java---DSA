# Change Case of a String

## 📌 Problem Statement

Given a string, change all uppercase letters to lowercase and all lowercase letters to uppercase.

---

## 💡 Approach

We traverse each character of the string and check its ASCII value.

### Steps:
1. Take string input from the user.
2. Traverse each character of the string.
3. Check:
   - If character is uppercase → convert to lowercase
   - If character is lowercase → convert to uppercase
4. Append the converted character to the result string.
5. Print the final string.

---

## 🧠 Example

### Input
```text
HeLLo
```

### Output
```text
hEllO
```

### Explanation
```text
Uppercase letters become lowercase
and lowercase letters become uppercase.
```

---

## 💻 Java Code

```java
import java.util.Scanner;

public class ChangeCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string:");

        String s = sc.nextLine();

        String res = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            int ascii = (int) c;

            // Uppercase to lowercase
            if (ascii >= 65 && ascii <= 90) {

                char temp = (char) (ascii + 32);

                res = res + temp;

            }

            // Lowercase to uppercase
            else if (ascii >= 97 && ascii <= 122) {

                char temp = (char) (ascii - 32);

                res = res + temp;
            }
        }

        System.out.println("changed case string is " + res);

        sc.close();
    }
}
```

---

## ⏱ Time Complexity

- **O(n)** → Traverse the string once.

---

## 📦 Space Complexity

- **O(n)** → Extra space used for result string.

---

## ✅ Key Points

- Uses ASCII value conversion
- Demonstrates character manipulation
- Beginner-friendly string problem
- Can also be solved using built-in functions
