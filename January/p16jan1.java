package January;
// find suffix of an array
public class p16jan1 {
    public static void main(String[] args) {
        int[] arr ={1,3,6,7,9};
        int[] ans = new int[arr.length];
        ans[arr.length-1] = arr[arr.length-1];

        for (int i = arr.length-2; i >=0 ; i--) {
            ans[i] = ans[i+1] +arr[i];
 
        }
        for (int i : ans) {
            System.out.print(i +",");
        } 
    }
}
