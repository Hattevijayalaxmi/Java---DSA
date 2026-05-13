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
