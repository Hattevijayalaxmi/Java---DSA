import java.util.Arrays;

class Solution {

    // Function to sort the array and return the largest element
    public static int sortArr(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Return the last element (largest element) after sorting
        return arr[arr.length - 1];
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize arrays
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};
        
        // Find and output the largest element in both arrays
        System.out.println("The Largest element in the array is: " + Solution.sortArr(arr1));
        System.out.println("The Largest element in the array is: " + Solution.sortArr(arr2));
    }
}
