package Revision;
//left roatate an array by D places.
public class p2mar {
   public static void main(String[] args) {
   int[] arr = {1,2,3,4,5,6,7,8,9,27};
   int d = 1;
   d = d%arr.length;                                                    //rotate by d places.

   reverse(arr, 0, d-1);
   reverse(arr, d, arr.length-1);
   reverse(arr, 0, arr.length-1);
   printArray(arr);
   }
   static void reverse(int[]arr,int start ,int till) {
   while (till>start) {
    int temp = arr[start];
    arr[start] = arr[till];
    arr[till] = temp;
    till--;
    start++;
   }

   }
   static void printArray(int[] nums){
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]+" ");
    }
   }
}
