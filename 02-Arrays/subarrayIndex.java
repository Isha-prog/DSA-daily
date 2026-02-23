public class subarrayIndex {
    public static int Index(int arr[], int k){
        if(arr.length<k){
            return -1;
        }
        int windowSum=0;
        int maxSum=0;
        int maxIndex=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        windowSum=maxSum;
        maxIndex=0;
        for(int i=k;i<arr.length;i++){
            windowSum-=arr[i-k];
            windowSum+=arr[i];
              if(windowSum>maxSum){
                maxSum=windowSum;
                maxIndex=i-k+1;
              }
        }
       return maxIndex;
    }
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int k=3;
       System.out.println(Index(arr,k));
    }
}
