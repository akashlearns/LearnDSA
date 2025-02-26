package Revision;
//Check if the array is sorted or not
public class p26feb {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,78};
        boolean a = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>=arr[i-1]) {
                a = true;
            }
            else{
                a = false;
            }
        }
        System.out.println(a);
    }
}
