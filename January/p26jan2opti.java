package January;
//taken help because of using the backtracking 
public class p26jan2opti {
    public static void main(String[] args) {
        String str = "Akash";
        printPermutation(str,0,str.length()-1);
    }
    public static void printPermutation(String str,int left,int right){
        if (left == right) {
            System.out.println(str); // Print the permutation
            return;
        }
        for (int i = left; i <= right; i++) {
            // Swap the characters at positions 'left' and 'i'
            str = swap(str, left, i);

            // Recurse with the next character fixed
            printPermutation(str, left + 1, right);

            // Backtrack (swap back to restore the original state)
            str = swap(str, left, i);
        }
    }
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}
