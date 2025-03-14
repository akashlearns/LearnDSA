package March;
//Searching a element in a 2d matrix.
public class p14mar {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        if (searchMatrix(matrix, target)) {
            System.out.println("Target found in matrix.");
        } else {
            System.out.println("Target not found.");
        }
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null)  return false ;
        int m = matrix.length;     // Number of rows
        int n = matrix[0].length;  // Number of columns 
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Avoids integer overflow
            int row = mid / n;
            int col = mid % n;
            int midElement = matrix[row][col];
        
            if (midElement == target) {
                return true;  // Target found
            } else if (midElement < target) {
                low = mid + 1;  // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return false;
            
    }   
 
}
