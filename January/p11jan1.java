package January;//BRUTE FORCE
//Find the missing no of a sorted array
public class p11jan1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        for(int j=arr[1] ; j<arr.length-1;j++){
            int flag = 0 ;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]==j) {
                    flag =1;
                    break;
                }
                }
                if (flag==0) {
                    System.out.println(j);
                }
        }
    }
}
