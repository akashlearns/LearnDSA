package December;
//sort an array consisting of 0s and 1s only ,by swaping.
class p3dec{
    public static void main(String[] args) {
        int[] arr ={1,1,0,0,1,0,1,1,1,0,0};
        int end = arr.length-1;
        int start=0;
        while (end>start) {
          if(arr[start]==1 && arr[end]==0){
            swap(arr,start,end);
            start++;
            end--;
          }
          else{
            if(arr[start]==0){
                start++;
            }
            if(arr[end]==1){
                end--;
            }
          } 
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
        
    
}