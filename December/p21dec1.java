package December;
// taking input of an 2d array
import java.util.Scanner;
public class p21dec1 {
    public static void main(String[] args) {
        System.out.println("Enter dimension of array & the the array");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
            }
            
        }
        for(int i = 0;i<r;i++){
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }





        sc.close();
    }
}
