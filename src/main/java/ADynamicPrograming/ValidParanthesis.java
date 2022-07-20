package ADynamicPrograming;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "([}}])";
        boolean valid = isValid(s);
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        // char c[] =s.toCharArray();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            }
        }
        return st.isEmpty();
    }
}

