import java.util.HashSet;

class firstRepeat{
    public static int firstRepeating(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        int first=-1;
        for(int i=arr.length-1;i>=0;i--){
          if(set.contains(arr[i])){
            first=i+1;
          }else{
            set.add(arr[i]);
          }
        }
        return first;
    }
    public static void main(String[] args) {
        int arr[]={1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeating(arr));
    }
}