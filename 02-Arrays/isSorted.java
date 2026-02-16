class isSorted {
    public static boolean Sorted(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={10,20,30,50};
       System.out.println(Sorted(arr));
    }
}