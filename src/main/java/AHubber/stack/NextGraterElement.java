package AHubber.stack;

import java.util.Stack;

public class NextGraterElement {
    public static void main(String[] args) {
        int a[] = {4,7,5,3,4,8,1};
        nextGenerator(a);
    }
    public static int[] nextGenerator(int a[]){
        int[] result= new int[a.length];

        Stack<Integer> stack = new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while ((!stack.isEmpty()) && stack.peek() <= a[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i]=-1;
            }else{
                result[i] =stack.peek();
            }
            stack.push(a[i]);
        }
        return result;

    }
}
