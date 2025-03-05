package March;

import java.util.HashMap;

//Two sum Problem.
public class p4mar{

    public static int[] twoSum(int n, int []arr, int target) {
        int[] ans = {-1,-1};
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = { 2,3, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                        + ans[1] + "]");

    }

}
