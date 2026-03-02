import java.util.HashMap;

public class firstNonRepeat {
    public static  int firstNonRepeating(int[] arr) {
       
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int num:arr)
            if(map.get(num)==1)
                return num;
            return 0;
            
        
    }
    public static void main(String[] args) {
        
         int arr[]={1,1,1};
         System.out.println(firstNonRepeating(arr));
    }
}
