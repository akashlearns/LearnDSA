package Revision;
//maimum number of consecutive ones in a array.
public class p27feb {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,1,1,0};
        int counter = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                counter++;
                if (counter>max) {
                    max = counter;
                }
            }
            else{
                counter=0;
            }

        }
        System.out.println(max);
    }
}
