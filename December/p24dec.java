package December;
// multiplication of an array
public class p24dec {
    public static void main(String[] args) {
        int[][] arr1 = {{1,6,3},{3,9,5},{5,6,7}};
        int[][] arr2 = {{9,6,9},{3,5,7},{5,7,0}};
        int[][] mul  = new int[3][3];
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k <3; k++) {
                    mul[i][j] += (arr1[i][k] * arr2[k][j]) ;
                }
            }
         }
         for(int i = 0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }

}
