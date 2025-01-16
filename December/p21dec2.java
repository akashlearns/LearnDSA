package December;
//Addition of matrix of 2d array.
public class p21dec2 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,6,3},{3,9,5},{5,6,7}};
        int[][] arr2 = {{9,6,9},{3,5,7},{5,7,0}};
        int[][] sum  = new int[3][3];
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j]; // simple addition
            }
         }
         for(int i = 0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
