package December;
//return a new array of sorted in non decreasing,and the square of original 
//array that is already sorted
public class p4dec {
    public static void main(String[] args) {
        int[] arr ={1,3,5,6,6,9};
        int[] SquredArray = square(arr);
        
        for (int i : SquredArray) {
            System.out.print(i +",");
        }

    }
    public static int[] square(int[]arr){
        int start = 0;
        int end =arr.length-1;
        int k = arr.length-1; ;//use k = arrr.length-1 , for reverse ans
        int[] ans = new int[arr.length];
        
        while (start<=end) {
            if (Math.abs(arr[start])>Math.abs(arr[end])) {
                ans[k--]=arr[start]*arr[start];//ue k-- to get reversed array
                start++;
            } else {
                ans[k--]=arr[end]*arr[end]; //ue k-- to get reversed array
                end--;
            }
        }
        return ans;
    }

}
