import java.util.*;
class Leader{
   static ArrayList<Integer> finder(int nums[]){
    
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = nums.length;
        int max=nums[n-1];
        leaders.add(nums[n-1]);
        for(int i=n-2;i>=0;i--){
            if(nums[i]>max){
                leaders.add(nums[i]);
                max=nums[i];
            }
        }



        // Since we added leaders from right to left, reverse the list before returning
        Collections.reverse(leaders);
        return leaders;

   }
    public static void main(String args[]){
         int[] nums = {1, 2, 5, 3, 1, 2};

        ArrayList<Integer> ans = finder(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}