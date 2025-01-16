package December;
//in an array of integrs , make all even at begining,and odd at last.
public class p3dec1 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9,12,96};
        int start = 0;
        int end =arr.length -1;

        while (end>start) {
            if (arr[start]%2!=0 && arr[end]%2==0) {
                swap(arr, start, end);
                start++;
                end--;
            }
            else{
                if(arr[start]%2==0){  //If arr[start] is even and arr[end] is even, 
                    start++;          // only start pointer moves inward.
                }
                if(arr[end]%2==1){
                    end--;
                };
            }
        }
        for (int i : arr) {
            System.out.print(i+",");
        }
    }
    public static void swap(int[]arr,int a,int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b] =temp;
    }
}
