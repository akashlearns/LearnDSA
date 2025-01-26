package January;
//output all permutation of a string.
public class p26jan2 {
    public static void main(String[] args) {
        String str ="AKASH";

        permutation(str);
    }
    public static void permutation(String str) {

        int totalpermutaion = factorial(str.length());
        for (int i = 0; i <totalpermutaion; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            StringBuilder currentPermutation = new StringBuilder(); // To store the current permutation
            for(int div =str.length();div>=1;div--){
                int r = temp % div; // Remainder gives the index to pick
                currentPermutation.append(sb.charAt(r)); // Add the character to the current permutation
                sb.deleteCharAt(r); // Remove the used character
                temp /= div; 
            }
            System.out.println(currentPermutation.toString());
        }
    }
    public static int factorial(int n){
        int val =1;
        for(int i  = 2;i<=n;i++){
            val*=i;
        }
        return val;
    }
}
