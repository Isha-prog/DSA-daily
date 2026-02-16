public class maxElement {
     public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        if(arr.length==0){
            return -1;
        }
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
             }
        
        return max;
        }

public static void main (String args[]){
int arr[]={11,2,6,85,4};
System.out.println(largest(arr));
    

}

}
