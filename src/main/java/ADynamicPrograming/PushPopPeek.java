package ADynamicPrograming;

import java.util.Stack;

public class PushPopPeek {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.peek();
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack);

    }
}
