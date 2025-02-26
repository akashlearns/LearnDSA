package Revision;
//right rotate an array by d places.
public class p26feb3 {
   public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,6,7,8,9};
    int d = 3;
    reverse(arr, arr.length-d,arr.length-1);
    reverse(arr, 0, arr.length-d-1);
    reverse(arr, 0, arr.length-1);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
    }
   } 
   static int[] reverse(int[]arr,int from,int d){
        int start = from;
        int end = d;
        while (end>start) {
            int temp=0;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
        return arr;
   }
}
