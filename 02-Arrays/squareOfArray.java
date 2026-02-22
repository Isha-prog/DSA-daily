public class squareOfArray {
    public static int[] sortedSquares(int[] nums) {
      int result[]=new int[nums.length];
       int i=0;
       int j=nums.length-1;
       int pos=nums.length-1;
       while(i<=j){
        int leftSquare=nums[i]*nums[i];
        int rightSquare=nums[j]*nums[j];
        if(leftSquare>rightSquare){
            result[pos]=leftSquare;
            i++;
        }else{
            result[pos]=rightSquare;
            j--;
        }
        pos--;
       } 
       return result;
    }
    public static void main(String args[]){
        int nums[]={-4,2,3,6};
        int fin[]=sortedSquares(nums);
        for(int res:fin){
            System.out.print(res+" ");
        }
    }
}
