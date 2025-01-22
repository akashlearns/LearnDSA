package January;
//move dublicate in a sorted array at last and tell the no of unique elements
public class p17jan2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,6,6,6};

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[j]) {
                arr[++j] =arr[i];
            }
        }
        System.out.println("Uniquw No are:"+(j+1));
    }
}
