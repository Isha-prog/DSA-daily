public class subarrayMax {
    public static int maxSubarraySum(int[] arr, int k) {
        
        if(arr.length<k){
            return -1;
        }
        int windowSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        for(int i=k;i<arr.length;i++){
            windowSum-=arr[i-k];
            windowSum+=arr[i];
            if(windowSum>maxSum){
                maxSum=windowSum;
            }
        }
        return maxSum;
    }
     public static void main(String args[]){
        int nums[]={1,5,7,3,2,4};
        int k=3;
        int result=maxSubarraySum(nums, k);
     
            System.out.println(result);
        
     }
}
