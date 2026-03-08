public class linearSearch {
    public static void main(String args[]){
        int arr[]={11,33,2,45,6,22,80};
        int k=45;
        linearS(arr,k);
    }
    public static void linearS(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println(i);
                return;
            }
        }
    }
}
