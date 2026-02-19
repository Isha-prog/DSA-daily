public class index {
    
    static int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={11,2,3,1,55};
        int x=3;
        System.out.println(search(arr,x));
    }

}
