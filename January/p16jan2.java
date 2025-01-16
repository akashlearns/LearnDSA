package January;
// Divide an array such that it has two subarrays with equal prefix sum
public class p16jan2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 1, 9, 1};

        // Step 1: Finding the total sum of the array
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Step 2: Check for the point where prefix sum equals suffix sum
        int prefixSum = 0;
        boolean found = false; // Flag to track if the split is possible
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                System.out.println("True");
                found = true;
                break;
            }
        }

        // If no such division is found, print "False"
        if (!found) {
            System.out.println("False");
        }
    }
}
