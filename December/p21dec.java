package December;
//2D arrays print 
public class p21dec {
    public static void main(String[] args) {
        int[][] arr = {{3,9},{2,7},{9,9},{4,7}};
        for(int i = 0 ;i< arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
