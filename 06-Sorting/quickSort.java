public class quickSort {
    public static void main(String[] args) {
        int arr[]={6,1,4,8,2,4,3};
        int n= arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pvtIdx=partition(arr,low,high);
            quickSort(arr, low, pvtIdx-1);
            quickSort(arr, pvtIdx+1, high);
        }

    }
   public static int partition(int arr[] , int low, int high){
    int pivot=arr[high];
    int i=low-1;
    for(int j=low;j<high;j++){
     if(arr[j]<pivot){
        i++;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }
    }
    i++;
    int temp=arr[i];
    arr[i]=pivot;
    arr[high]=temp;
    return i;
   }
}
