
import java.util.*;
public class freqcount {
    
   
    public static List<Integer> frequencyCount(int[] arr) {
        
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
      
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            result.add(map.getOrDefault(i, 0));
        }
        
        return result;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,4,1,5};
        System.out.println(frequencyCount(arr));
    }
}

