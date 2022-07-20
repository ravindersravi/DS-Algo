package AHubber.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n =4;
        String[] strings = generateNumber(n);
        System.out.println(Arrays.toString(strings));
    }
    public static String[] generateNumber(int n){

        String result[] = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");  //insert an element
        for(int i=0;i<n;i++){
            result[i]= q.poll();  //poll returns and removes the element at the front end of the container
            String n1= result[i]+"0";
            String n2= result[i]+"1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
}
