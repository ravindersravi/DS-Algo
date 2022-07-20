package AHubber.circular;

import java.util.List;

public class CircularSinglyLinkedList {

    private ListNode last;
    private  int length;

    static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        last =null;
        length =0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }


    public static void main(String[] args) {
    CircularSinglyLinkedList c1= new CircularSinglyLinkedList();
    c1.createCircularLinkedList();
    c1.display();
        ListNode listNode = c1.insertElementAtBegining(3);
        ListNode listNode1 = c1.insertElementAtBegining(12);
        c1.display();
        ListNode listNode2 = c1.insertAtEnd(99);
        c1.display();
        ListNode listNode3 = c1.removeFirstNode();
        c1.display();
    }

    public ListNode removeFirstNode(){
        if(isEmpty()) return null;
        ListNode temp = last.next;
        if(last.next==last){
            last=null;
        }
        else{
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
    }

    public ListNode insertAtEnd(int val){
        ListNode newNode = new ListNode(val);
        if(last==null){
            last.next=newNode;
        }
        else{
            newNode.next= last.next;
            last.next=newNode;
            last = newNode;
        }
        length++;
        return last;
    }
    public ListNode insertElementAtBegining(int val){
        ListNode newNode = new ListNode(val);
        if(last==null){
            last=newNode;
        }
        else{
            newNode.next=last.next;
        }
        last.next=newNode;
        length++;
        return last;
    }
    public void createCircularLinkedList(){
    ListNode first = new ListNode(1);
    ListNode second = new ListNode(5);
    ListNode third = new ListNode(10);
    ListNode fourth = new ListNode(15);

    first.next=second;
    second.next= third;
    third.next=fourth;
    fourth.next=first;

    last= fourth;
    }

    public void display(){
        if(last==null){
            return;
        }
        ListNode first = last.next;
        while (first!=last){
            System.out.print(first.data+" ");
            first=first.next;
        }
        System.out.println(first.data+ " ");
    }
}
