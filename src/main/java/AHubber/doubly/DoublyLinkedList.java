package AHubber.doubly;

import java.util.List;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;


    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length ==0; // head ==null
    }
    public int length(){
        return length;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(3);
        ListNode second = new ListNode(6);
        ListNode third = new ListNode(9);
        ListNode fourth = new ListNode(12);
        DoublyLinkedList d1 = new DoublyLinkedList();
        d1.head=first;
        first.next= second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;


        d1.tail=fourth;

        fourth.previous= third;
        third.previous=second;
        second.previous=first;

        displayForward(first);
        displayBackward(fourth);

        ListNode listNode = d1.insertAtBegining(1);
        displayForward(listNode);
        ListNode listNode1 = d1.insertAtEnd(15, fourth);
        displayForward(listNode1);


    }

    public  ListNode deleteElementAtBegining(){
        if(isEmpty()){
        }
        ListNode temp = head;
        if(head==tail){
            tail= null;
        }
        else{
            head.next.previous=null;
        }
        head = head.next;
        temp.next=null;
        return temp;
    }
    public ListNode deleteNodeAtEnd(){
        if(isEmpty()){

        }
        ListNode temp = tail;
        if(head==tail){
            head =null;
        }
        else {
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous =null;
        return temp;
    }

    public ListNode insertAtEnd(int val, ListNode tail){
        ListNode newNode= new ListNode(val);
        if(isEmpty()){
           // tail=newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous=tail;
        }
        //tail=newNode;
        length++;
        return head;

    }
    public  ListNode insertAtBegining(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail= newNode;
        }
        else {
            head.previous= newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
        return head;
    }
    public static void displayForward(ListNode head){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void displayBackward(ListNode tail){
        ListNode temp = tail;
        while (temp!=null){
            System.out.print(temp.data+" -->");
            temp=temp.previous;
        }
        System.out.println("null");
    }
}
