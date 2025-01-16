package December;
//to give transpose of as output of the matrix
public class p27dec {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5},{6,7,9},{9,6,5}};

        printArray(arr);
        System.out.println("Output");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {//imp is j<i 
                int temp =arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printArray(arr);
    }
    
    
    public static void printArray(int[][]arr){
        for(int i = 0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
