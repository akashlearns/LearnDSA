package January;
//moving the dublicates to the end of the array , maintainging the order,
//Uniques at front .Similar to p17jan2.java
public class p23jan1 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,3,4,5,5,6};
        int i = 0;
        for (int j = 1; j < nums.length ; j++) {
            if( nums[j]!=nums[i]){
                nums[++i]=nums[j];
            
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
