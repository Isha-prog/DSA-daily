public class reverse {
    
     static int[] reverseArray(int arr[]) {
        // code here
        int j=arr.length-1;
                int i=0;
        while(i<j){
             int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               i++;
               j--;
            }
        
        return arr;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        arr = reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

