package Revision;
//Find the largest no.
public class p25feb1 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,6,7,9,27};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]> largest){
                largest =arr[i];
            }
        }
        System.out.println(largest);

        
    }
}
