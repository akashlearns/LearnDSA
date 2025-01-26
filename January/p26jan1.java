package January;
//output the diff. between the letters of a string
//like "ab" = -1; gba=g5b-1a
//baad Wale k ASCII phale wale se - kero
public class p26jan1 {
    public static void main(String[] args) {
        String str = "gkpwqa";
        System.out.println(stringDiff(str));
    }
    public static String stringDiff( String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char prev = str.charAt(i-1);
            sb.append(current-prev);//or int diff = current-prev; then sb.append(diff)
            sb.append(current);
            
        }
        
        return sb.toString();
    }
}
