package Revision;
//Move all the 0 to the end of the array.
public class p27feb1 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,2,0,3,4,5,6,0,0,0,7,9};
        int setter =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                if(i!=setter){
                    int temp =nums[setter];
                    nums[setter] =nums[i];
                    nums[i]=temp;

                }
                setter++;
            }

        }
        
  
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

    }
}
