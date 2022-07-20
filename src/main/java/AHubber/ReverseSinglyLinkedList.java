package AHubber;

public class ReverseSinglyLinkedList {
    private ListNode head;

    static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next =null;

        }
    }

    public static void main(String[] args) {
        ReverseSinglyLinkedList sl1 = new ReverseSinglyLinkedList();
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        sl1.head=head;
        sl1.head.next = second; // 10 --> 1
        second.next = third;    // 10 -->1 -->8
        third.next = fourth;   // 10 -->1 -->8 -->11
        fourth.next = null;  // 10 -->1 -->8 -->11-->null
        sl1.display(head);
        ListNode reverse = sl1.reverse(head);
     //   System.out.println(reverse.data);
        sl1.display(reverse);
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
       ListNode current = head;
       ListNode next = null;
       ListNode previous =null;

       while(current!=null){
           next = current.next;
           current.next=previous;
           previous=current;
           current= next;
       }
       return previous;
    }
    public void display(ListNode head){
        ListNode current =head;
        while (current != null){
            System.out.print(current.data +" --> ");
            current=current.next;
        }
        System.out.println("null");
    }
}
