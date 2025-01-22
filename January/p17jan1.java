package January;
//Merging 2 sorted arrays
public class p17jan1 {
    public static void main(String[] args) {
        int[] a = {1,9,10,0,0,0};//m =3
        int[] b= {6,7,9};//m=3 
        int m = 3,n =3;
        int i = m -1;      
        int j = n - 1;      
        int index = m + n - 1;

        while (j>=0) {
            if (a[i]>=b[j]) {
                a[index--] =a[i--];   
            }
            else{
                a[index--]= b[j--];   
            }
        }
        
        while (j>=0) {
            a[index--] = b[j--];
        }
        
        for (int num : a) {
            System.out.print(num + " ");
        } 
    } 

}