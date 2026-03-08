class binarySearch{
    public static void main(String[] args) {
        int arr[]={10,15,18,34,56,70};
        int k=34;

        binaryS(arr, k);
    }
    public static void binaryS(int arr[] , int k){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                System.out.println( mid);
                return;
            }else if(arr[mid]<k){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }

    }
}