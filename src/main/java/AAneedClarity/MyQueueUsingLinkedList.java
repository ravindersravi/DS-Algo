package AAneedClarity;

public class MyQueueUsingLinkedList {
    int k;
    int size =0;
    Node head;
    Node tail;
    public MyQueueUsingLinkedList(int k){
        this.k =k;
        head = null;
        tail = null;
    }
    public boolean enQueue(int value){
        if(size<k){
            size++;
            Node new_node = new Node(value);
        }
        return true;
    }
    public static void main(String[] args) {


    }

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }




}
