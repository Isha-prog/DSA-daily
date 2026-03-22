public class SlidingWindow {
    public static void main(String args[]){
        int arr[]={11,2,3,4,5};
        int k=3;
        int windowSum=0;
        int maxSum=0;
        // for(int i=0;i<k;i++){
        for(int i=0;i<k-1;i++){
            windowSum+=arr[i];
    }
    maxSum=windowSum;
    // for(int i=k;i<arr.length;i++){
    for(int i=1;i<arr.length-k;i++){
        // windowSum=windowSum+arr[i]-arr[i-k];
         windowSum=windowSum+arr[i-1]+arr[i-1+k];
        maxSum=Math.max(maxSum,windowSum);
    }
    System.out.println("Maximum Sum= "+maxSum);
}
}
