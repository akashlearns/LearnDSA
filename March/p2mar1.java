package March;
//union of two sorted arrray. 
public class p2mar1 {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,4,5,7,9};
        int[] arr2 = {0,1,2,4,5,7,9,10};

        int i = 0 ;
        int start1 = 0;
        int start2 = 0;
        int end1= arr1.length-1;
        int end2= arr2.length-1;
        int[] union = new int[arr1.length+arr2.length];
        while(end2>=start2 || end1>=start1){
            if(arr1[start1]<=arr2[start2]){
                if(i ==0||union[i-1]!= arr1[start1]){
                    union[i] = arr1[start1];
                    i++;
                    start1++;
                }

            }
            if(arr2[start2]<=arr1[start1]){
                if(i==0||union[i-1]!=arr2[start2]){
                    union[i] =arr2[start2];
                    i++;
                    start2++;
                }
            }


        }
        for (int j = 0; j < union.length; j++) {
            System.out.print(union[j]);
        }

    }
}
