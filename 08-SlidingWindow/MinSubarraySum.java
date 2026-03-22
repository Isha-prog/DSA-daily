public class MinSubarraySum {
    public static int subArray(int arr[], int target){
        int left=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>=target){
                minLen=Math.min(minLen,right-left+1);
                sum-=arr[left];
                left++;
            }
        }
        return (minLen==Integer.MAX_VALUE)?0:minLen;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,5,3,2,1};
        int target=9;
        System.out.println(subArray(arr, target));
    }
}
