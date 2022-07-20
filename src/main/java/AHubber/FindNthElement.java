package AHubber;

public class FindNthElement {
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
        FindNthElement f1 = new FindNthElement();
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(8);
        f1.head = head;
        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        f1.display(head);
        ListNode nthNode = f1.findNthNode(1);
        System.out.println(nthNode.data);

    }
    public ListNode findNthNode(int val){
        ListNode mainP = head;
        ListNode refP = head;
        int count =0;
        while(count<val){
            refP = refP.next;
            count++;
        }
        while (refP!=null){
            refP= refP.next;
            mainP= mainP.next;
        }
        return mainP;
    }

    public void display(ListNode head){
        ListNode current =head;
        while (current!=null){
            System.out.print(current.data +" --> ");
            current=current.next;
        }
        System.out.println("null");
    }
}
