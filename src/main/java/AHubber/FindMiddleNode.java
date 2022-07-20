package AHubber;

public class FindMiddleNode {
    ListNode head;
    static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        FindMiddleNode f1 = new FindMiddleNode();
        ListNode head = new ListNode(10);
        ListNode first = new ListNode(12);
        ListNode second = new ListNode(14);
        ListNode third = new ListNode(16);
        ListNode fourth = new ListNode(18);
        f1.head = head;
        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        f1.display(head);
        ListNode middle = f1.findMiddle();
        System.out.println(middle.data);

    }
    public void display(ListNode head){
        ListNode current =head;
        while (current!=null){
            System.out.print(current.data +" --> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public ListNode findMiddle(){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}
