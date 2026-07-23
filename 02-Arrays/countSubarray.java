import java.util.*;
class countSubarray{
    static int countSub(int arr[],int k){
     int n=arr.length;
     int count=0;
     for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum+=arr[j];
            if(sum==k){
            count++;
        }
     }
    }
return count;
    }
    public static void main(String args[]){
int arr[]={1,2,3};
int k=3;
System.out.println("The number of subarrays are: "+countSub(arr,k));
    }
}