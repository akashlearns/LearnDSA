package January;
import java.util.Scanner;

//Change the Case of letter in a String.
public class p26jan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentance:");
        String str = sc.nextLine();
        sc.close();
        String output = toggleCase(str);
        System.out.println(output);
    }
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = sb.charAt(i);
            if (ch>='a'&&ch<='z') {
                char upperCh = (char)('A'+ ch - 'a');
                sb.setCharAt(i,upperCh);

            } else if(ch>='A'&&ch<='Z') {
                char lowerCh =(char)('a'+ch-'A');
                sb.setCharAt(i, lowerCh);
            }
        }
        return sb.toString();
        //If a method modifies an object (like StringBuilder) 
        //but doesn't return it, the changes are limited to the method's scope.
    }
}
