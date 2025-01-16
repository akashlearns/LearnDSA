package December;
// to reverse the rows of a 2D array.
public class p25dec {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5},{5,6,7},{9,6,3},{3,9,5}};
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr.length-1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After:");


        for (int i = 0; i < arr.length; i++) {
            int[] arrayRows = arr[i];
            int start = 0;
            int temp = 0;
            int end = arrayRows.length-1;
            while (end>start) { //swaping the values of each array(1 D)
                temp = arrayRows[start];
                arrayRows[start] =arrayRows[end];
                arrayRows[end] = temp;
                end--;
                start++;
            }
            for (int j = 0; j < arrayRows.length; j++) {
                System.out.print(arrayRows[j] +" ");
            }
            System.out.println();
        }
    }
}
