package January;
// make unique elements come to front inplace in a sorted array
public class p11jav {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int i = arr[0];
        int j =arr[0];
        while (j<arr.length) {
            if (arr[i]< arr[j]) {
                arr[i] = arr[j];
                i++;
            } else {
               j++; 
            }
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]+" ");
        }
    }
}
