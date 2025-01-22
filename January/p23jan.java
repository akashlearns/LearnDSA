package January;
// Remove dublicate of k in an array
public class p23jan {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int k = 1;
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                arr[count]=arr[i];
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
