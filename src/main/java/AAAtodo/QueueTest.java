package AAAtodo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(123);
        Q.add(234);
        Q.add(345);
        Q.add(456);
        System.out.println("Queue: "+Q);
        System.out.println("QUeue's head "+Q.poll());
        System.out.println("Q "+Q.peek()); //which will not remove element
        Q.offer(567);
        Q.remove();
        Q.peek();
        Q.element();
        System.out.println("data "+Q);


    }
}
