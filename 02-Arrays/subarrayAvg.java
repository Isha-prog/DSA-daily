public class subarrayAvg {
    public static double findMaxAverage(int[] nums, int k) {
       if(nums.length<k){
        return -1;
       } 
       int windowAvg=0;
       int maxAvg=0;
       for(int i=0;i<k;i++){
        windowAvg+=nums[i];
       }
       maxAvg=windowAvg;
       for(int i=k;i<nums.length;i++){
         windowAvg-=nums[i-k];
         windowAvg+=nums[i];
         if(windowAvg>maxAvg){
            maxAvg=windowAvg;
         }
       }
       return (double) maxAvg/k;
    }
     public static void main(String args[]){
        int nums[]={1,12,-5,-6,50,3};
        int k=4;
        System.out.print(findMaxAverage(nums, k));
     }
}
