public class countOccur {
    static int countOccurenece(int[] arr,int target){
        int count=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
        count++;
    }
    }
    return count;
   
    }
    public static void main (String args[]){
int [] arr={1,2,2,3,4,2,2,3,1,3};
int target=3;
int result=countOccurenece(arr,target);
System.out.println(result);
    }
}
