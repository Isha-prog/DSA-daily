
class rotateLeftOne{
 public void rotateArrayByOne(int[] nums) {
    int temp=nums[0];
    for(int i=1;i<nums.length;i++){
        nums[i-1]=nums[i];
    }
    nums[nums.length-1]=temp;
 }
    public static void main(String[] args) {
      rotateLeftOne solution = new rotateLeftOne();
        int[] nums = {1, 2, 3, 4, 5};

        solution.rotateArrayByOne(nums);

        // Output the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
    
