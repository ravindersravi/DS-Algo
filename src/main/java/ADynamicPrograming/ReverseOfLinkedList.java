package ADynamicPrograming;

import java.util.Scanner;
import java.util.Stack;

//with even locations
public class ReverseOfLinkedList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 9;
     //   9
    //    2 18 24 3 5 7 9 6 12
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            int num = scan.nextInt();
            if(num % 2 ==0){
                stack.push(num);
            }else{
                if (!stack.empty()) {
                    while (!stack.empty()) {
                        System.out.print(stack.pop() + " ");
                    }
                }
                System.out.print(num+" ");
            }
        }
        while (!stack.empty())
            System.out.print(stack.pop() + " ");

    }
}
