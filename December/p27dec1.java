package December;
// rorate an array by 90degree.
public class p27dec1 {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{7,9,5},{6,9,1}};
        for(int i = 0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Output");
        for (int i = 0; i < arr.length; i++) { //step 1:find transpose
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {//step 2:rotate each arr of 2d 
            int[] arrayRows = arr[i];         // matrix
            int start = 0;
            int temp = 0;
            int end = arrayRows.length-1;
            while (end>start) {
                temp = arrayRows[start];
                arrayRows[start] =arrayRows[end];
                arrayRows[end] = temp;
                end--;
                start++;
            }
        }
        for(int i = 0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
