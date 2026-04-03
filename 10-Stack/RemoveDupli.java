import java.util.*;
class RemoveDupli{
    static void DuplicateChar(String s){
        HashSet<Character> set=new HashSet<>();
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!set.contains(ch)){
                stack.push(ch);
                set.add(ch);
            }
        }
        StringBuilder result=new StringBuilder();
        for(char ch:stack){
            result.append(ch);
        }
        System.out.println("After removing duplicates: "+result);
    }
    public static void main(String[] args) {
        String s ="Programming";
    DuplicateChar(s);
    }
}