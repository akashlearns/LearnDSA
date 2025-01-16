package January;

import java.util.Scanner;

//print a 2d matrix in sprial order.
public class p16jan4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{1,4,6}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and Column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int topRow = 0,rightCol = c -1,leftCol=0,buttomRow  =r-1,totalElements = 0;
                

        while(totalElements<r*c){
            for (int i = leftCol; i <=rightCol; i++) {//top to right
                System.out.print(arr[topRow][i] + " ");
                totalElements++;
            }
            topRow++;
            for (int i2 = topRow; i2 <=buttomRow; i2++) {//right to buttom
                System.out.print(arr[i2][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            for (int i3 = rightCol; i3 >= leftCol; i3--) {//buttom to left
                System.out.print(arr[buttomRow][i3] + " ");
                totalElements++;
            }
            buttomRow--;
            for (int i4 = buttomRow; i4 >=topRow; i4--) {//left to top
                System.out.print(arr[leftCol][i4] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }
}
