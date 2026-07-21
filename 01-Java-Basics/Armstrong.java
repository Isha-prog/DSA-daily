public class Armstrong {
    static boolean arms(int num){
        int sum=0;
        int n=num;
        int k=String.valueOf(num).length(); // Calculate the number of digits

        while(n>0){
            int ld=n%10;
            sum+=Math.pow(ld,k);
            n=n/10;
        }
        if(num==sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(arms(153));
        System.out.println(arms(123));
    }
}
