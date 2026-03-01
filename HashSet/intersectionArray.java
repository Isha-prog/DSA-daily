import java.util.HashSet;

public class intersectionArray {
    
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
       for(int num:nums1){
        set.add(num);
       }
       for(int num:nums2){
        if(set.contains(num)){
            result.add(num);
        }
       }
        int arr[]=new int[result.size()];
        int i=0;
        for(int num:result){
            arr[i++]=num;
        }


        return arr;
       
    }

    public static void main(String[] args) {
        int nums1[]={1,2,1,2,3};
        int nums2[]={1,2};
        int res[]=intersection(nums1, nums2);
        for(int ans:res){
            System.out.println(ans);
        }  
    }
}
