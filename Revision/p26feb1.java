package Revision;
//Find the second largest element without soring.
public class p26feb1 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,58,58,6,9,27};
        int max= arr[0];
        int secondLargest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                secondLargest = max;
                max =arr[i];
            }
            else if (arr[i]>secondLargest && arr[i]!= max){
                secondLargest =arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
