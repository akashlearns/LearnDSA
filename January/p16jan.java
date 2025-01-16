package January;
import java.util.Scanner;

//Find prefix of an given array from l to r ,of 1 based indexing
public class p16jan {
    public static void main(String[] args) {
        int[] arr= {1,3,5,7,9,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter L(from):");
        int l = sc.nextInt();
        System.out.println("Enter R(till)");
        int r = sc.nextInt();
        sc.close();

        int[] prefix = new int[arr.length];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1] + arr[i-1];//arr-1 cause of 1 based indexing.

        }
        System.out.println("The answer of the Query is :");
        int q = prefix[r] -prefix[l-1]; //l-1 because 1 based indexing
        System.out.println(q);
    }

}
