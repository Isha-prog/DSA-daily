public class selectionSort {
    public static void main(String[] args) {
        int arr[]={1,5,9,3,4,2,6};
       int n=arr.length;
        for(int i=n-1;i>0;i--){
             int largest=0;
             for(int j=1;j<=i;j++){
                if(arr[j]>arr[largest]){
                    largest=j;
                }
             }
             int temp=arr[i];
             arr[i]=arr[largest];
             arr[largest]=temp;
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
