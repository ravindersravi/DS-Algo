
package AHubber;

import java.util.List;

public class SinglyLinkedList {

    private ListNode head;

    static class ListNode {
        private int data; //data type generic
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        sl1.head.next = second; // 10 --> 1
        second.next = third;    // 10 -->1 -->8
        third.next = fourth;   // 10 -->1 -->8 -->11
        fourth.next = null;  // 10 -->1 -->8 -->11-->null
        sl1.display();
        int length = sl1.length();
        System.out.println(length);



    }

    public int length(){
        if(head==null) return 0;
        int count =0;
        ListNode current = head;
        while (current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void display(){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
