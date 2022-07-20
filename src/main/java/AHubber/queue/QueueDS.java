package AHubber.queue;

import java.util.NoSuchElementException;

public class QueueDS {

    ListNode front;
    ListNode rear;
    private int length;

    static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public static void main(String[] args) {
        QueueDS queueDS= new QueueDS();
        queueDS.enqueue(10);
        queueDS.enqueue(15);
        queueDS.enqueue(30);
        queueDS.print();
        int dequeue = queueDS.dequeue();
        System.out.println(dequeue);
        queueDS.print();
    }


    public  int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front==null){
            rear =null;
        }
        length--;
        return result;
    }

    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return rear.data;
    }

    public void print(){
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while(current !=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else
            rear.next = temp;
        rear = temp;
        length++;
    }
}
