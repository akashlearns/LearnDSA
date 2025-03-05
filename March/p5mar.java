package March;

import java.util.ArrayList;

//Leaders in Array.
public class p5mar {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        int maxi = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i =  arr.length-1;i>=0; i--) {
            if (arr[i]> maxi) {
                maxi = arr[i];
                ans.add(maxi);

            }
        }
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
