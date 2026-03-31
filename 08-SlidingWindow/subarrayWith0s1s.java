import java.util.*;
public class subarrayWith0s1s {
    static int countSubarray(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
int sum=0;
int count=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]==0){
        arr[i]=-1;
    }
    sum+=arr[i];
    if(sum==0){
        count++;
    }
    if(map.containsKey(sum)){
        count+=map.get(sum);
    }
    if(!map.containsKey(sum)){
        map.put(sum,1);
    }else{
        map.put(sum,map.get(sum)+1);
    }


}
return count;
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,1,0};
        System.out.println(countSubarray(arr));
    }
}
