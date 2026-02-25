import java.util.HashMap;

public class containdupli {
    public static boolean containsDuplicate(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
            return true;
            }
        map.put(num,1);
    }
        return false;
    }
    public static void main(String args[]){
  int arr[]={1,2,1,3,2,4,5};
  System.out.println(containsDuplicate(arr));
    }
}
