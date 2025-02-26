package Revision;
//Linear Search ,finf k.  
public class p26feb2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9,9,9,72,72};
        int k = 72;
        boolean found= false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== k) {
                System.out.println(i+"th is the index of k");
                found = true;
            }
        }
        if(found !=true){
            System.out.println(k +"is not present in array");
        }
    }
}
