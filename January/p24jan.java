package January;
import java.util.Scanner;

// change Case of input
public class p24jan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sc.close();
        
        for (int i = 0; i < sb.length(); i++) {
           
           char ch = sb.charAt(i);
           int ascii = (int)ch;
            
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                if (ascii>=97) {
                    ascii -=32 ;
                    char fl= (char)ascii;
                    sb.setCharAt(i, fl);
                } else {
                    ascii +=32 ;
                    char fl= (char)ascii;
                    sb.setCharAt(i, fl);
                }
            }    
        }
        System.out.println(sb);
    }
}
/*    for (int i = 0; i < sb.length(); i++) {
        char ch = sb.charAt(i);
        if (Character.isLowerCase(ch)) {
            sb.setCharAt(i, Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            sb.setCharAt(i, Character.toLowerCase(ch));
        }
    }
*/
