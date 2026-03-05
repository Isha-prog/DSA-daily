class isPalindrome{
    public static boolean isPalin(int x){
        if(x<0) return false;
        int original=x;
        int reversed=0;
        while(x!=0){
            int digit=x%10;
            reversed=reversed*10+digit;
            x=x/10;
        }
        return original==reversed;
    }
    public static void main(String[] args) {
        int x=101;
        System.out.println(isPalin(x));
    }
}