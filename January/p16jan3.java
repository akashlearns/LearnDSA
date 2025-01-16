package January;
import java.util.Scanner;
//print pascal's triangle of n 
public class p16jan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        sc.close();
        int[][] pascalArray = new int[n][];//columns are changing.Pascal triangle condi 1

        for (int i = 0; i < n; i++) {
            pascalArray[i] = new int[i+1];
            pascalArray[i][0] = pascalArray[i][i]=1;// Pascal triangle condition2
            for (int j = 1; j < i; j++) { // Pascal triangle condition3
                pascalArray[i][j]= pascalArray[i-1][j] + pascalArray[i-1][j-1];
            }
        }
        printArray(pascalArray,n);

    } 
    public static void printArray(int[][]arr,int n){
        for(int i = 0;i<n;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            
            System.out.println();
        }
    }
}
