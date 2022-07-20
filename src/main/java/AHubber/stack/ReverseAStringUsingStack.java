package AHubber.stack;

import java.util.Stack;

public class ReverseAStringUsingStack {
    public static void main(String[] args) {
        String s = "hyd";
        String s1 = reverseString(s);
        System.out.println(s1);

    }
    public static String reverseString(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c: chars){
            stack.push(c);
        }
        for(int i=0;i<s.length();i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
