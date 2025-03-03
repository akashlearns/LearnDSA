package Revision;
//Remove duplicates from Sorted Array
public class p2mar1 {
    public static void main(String[] args) {
        int[] arr= {1,1,1,2,2,2,2,2,3,4,5,52};
        int count = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] !=arr[count-1]){
                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println(count);
        printArray(arr);

    }
    static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
       }
}
