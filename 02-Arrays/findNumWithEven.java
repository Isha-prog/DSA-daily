public class findNumWithEven {
   
    public static int findNumbers(int[] nums) {
        
        
        int even=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];

            int count=0;
            while(num>0){
            count++;
           num/=10;
 }
 if(count%2==0){
   even++; 
 }
}
 return even;

    }
    public static void main (String args[]){
        int nums[]={11,2,445,7768};
       int result= findNumbers(nums);
       System.out.println(result);
    }
}
    

