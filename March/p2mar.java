package March;
//Find the missing no ,in an array having x distinct elements.
public class p2mar {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        optimal1(arr, n);
        optimal2(arr);
    }
    static void optimal1(int[] arr, int n){
        int sum = ((n+1)*(n+2))/2;        // the array have n-1 element beause one is missing so add 1 to arr.length
        int arrSum = 0;

        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }

        System.out.println(sum - arrSum);
    }

    static void optimal2(int[] arr){
        int xor1 = 0, xor2 = 0;


        // XOR all elements of the array
        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
            xor1 ^= (i+1);

        }
        xor1^=arr[arr.length-1];
                // The missing number is the XOR difference
        System.out.println("Missing number: " + (xor1 ^ xor2));
            
    }
}
