package January;
import java.util.Scanner;

//Strings basics
public class p25jan {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        sc.close();
        Substring(s);
    }
    public static boolean Palidrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<=j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1==ch2) {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }

        // Print all palidrome of a string
    public static void Substring(String s) {
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String ss = s.substring(i, j);
                if( Palidrome(ss) ==true){
                    System.out.println(ss);
                }
            }
        }
    }
}
//NOTE
// interning is
// re-using objects of on-demand instead of creating new objects.