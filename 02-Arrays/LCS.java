import java.util.*;
class LCS{
    static boolean exist(int nums[],int num){
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==num){
                return true;
            }
        }
        return false;
    }
    static int lcs(int nums[]){
        if(nums.length==0){
            return 0;
        }
        int n=nums.length;
        int longest=1;
        for(int i=0;i<n;i++){
int count=1;
int x=nums[i];
            
               while(exist(nums,x+1)){
                   x++;
                     count++;
                }
            longest=Math.max(longest,count);
            
        }
        return longest;
    }
    public static void main(String args[]){
int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(lcs(a));
    }

}