import java.util.Arrays;

class Solution {

    // Function to sort the array and return the smallest element
    public static int sortArr(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the first element (smallest element) after sorting
        return arr[0];
    }
}

public class Main {

    public static void main(String[] args) {
        // Array 1
        int[] arr1 = {2, 5, 1, 3, 0};
        System.out.println("The smallest element in the array is: " + Solution.sortArr(arr1));
    }
}
