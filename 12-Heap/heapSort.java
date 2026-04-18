class heapSort{
    void heapify(int arr[],int n,int i){
        int largest=i;
        int right=2*i+2;
        int left=2*i+1;
        if(left<n&&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n&&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
        }
    }
    void HeapSort(int arr[]){
int n=arr.length;
for(int i=n/2-1;i>=0;i--){
    heapify(arr, n, i);
}
    
    for(int i=n-1;i>0;i--){
int temp=arr[0];
arr[0]=arr[i];
arr[i]=temp;
heapify(arr, i, 0);
    }
}
void display(int arr[]){
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    heapSort obj=new heapSort();
     int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array:");
        obj.display(arr);

        obj.HeapSort(arr);

        System.out.println("Sorted Array:");
        obj.display(arr);
}
}