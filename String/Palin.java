public class Palin {
    public static void main(String args[]){
        String test[]={"level","mam","hello","racecar",""};
        for(String str:test){

        
        if(isPalindrome(str)){
            System.out.println(str+"is palindrome");
        }else{
            System.out.println(str+"is not a palindrome");
        }
    }
}
static boolean isPalindrome(String str){
int i=0;
int j=str.length()-1;
while(i<j){
    if(str.charAt(i)!=str.charAt(j)){
        return false;
    }else{
        i++;
        j--;
    }
}
return true;

}
}
