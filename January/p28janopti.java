package January;
//Reversing a string using swap 
public class p28janopti {
    public static void main(String[] args) {
        String str = "hardwork";
        StringBuffer sb = new StringBuffer(str);
        
        int end = str.length()-1;
        for (int i = 0; i <= (end+1)/2; i++) {
            char first = sb.charAt(i);
            char last  = sb.charAt(end);
            sb.setCharAt(i,last);
            sb.setCharAt(end, first);
            end--;
        }
        System.out.println(sb.toString());
        
    }
}
