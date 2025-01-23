package January;
// remove some duplicates in-place such that
// each unique element appears at most twice
public class p23jan2 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,3,4,5,5,5,6};
        int i = 0;
        for (int j = 1; j < nums.length ; j++) {
            if( i < 2 || nums[j] != nums[i - 2]){
                nums[++i]=nums[j];
            
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
