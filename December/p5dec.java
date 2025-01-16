package December;
//find prefix of the array
public class p5dec {
    public static void main(String[] args) {
        int[] arr ={1,3,6,7,9};
        int[] ans = new int[arr.length];
        ans[0] = arr[0];

        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i-1] +arr[i];
 
        }
        for (int i : ans) {
            System.out.print(i +",");
        }
    }
}
