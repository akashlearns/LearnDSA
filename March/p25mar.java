package March;
//kadane Algorithm
public class p25mar {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-4,-5,6,-7,9};
        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxsum = Math.max(maxsum, currSum);
            if (currSum<0){currSum = 0;}
        }
        System.out.println(maxsum);
    }
}
