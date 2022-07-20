package AHubber;

public class Merge2SortedSinglyLinkedList {
    ListNode head;
    static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next= null;
        }
    }

    public static void main(String[] args) {
        Merge2SortedSinglyLinkedList ms= new Merge2SortedSinglyLinkedList();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(7);
        ms.head=first;
        first.next=second;
        second.next=third;
        third.next=null;
        ms.display(first);     //741+ 952

        Merge2SortedSinglyLinkedList ms2= new Merge2SortedSinglyLinkedList();
        ListNode first2 = new ListNode(2);
        ListNode second2 = new ListNode(5);
        ListNode third2 = new ListNode(9);
        ms2.head=first2;
        first2.next=second2;
        second2.next=third2;
        third2.next=null;
        ms.display(first2);

        Merge2SortedSinglyLinkedList pr = new Merge2SortedSinglyLinkedList();
//        ListNode merge = merge(first, first2);
//        pr.display(merge);
        ListNode sum = add2Numbers(first, first2);
        pr.display(sum);


    }

    public static ListNode add2Numbers(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry =0;
        while(a!=null ||b!=null){
            int x= (a!=null) ? a.data:0;
            int y = (b!=null)? b.data : 0;
            int sum = carry+x+y;
            carry = sum/10;
            tail.next = new ListNode(sum%10);
            tail= tail.next;
            if(a!=null) a=a.next;
            if(b!=null) b=b.next;
        }
        if(carry>0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a!=null && b!=null){
            if(a.data<b.data){
                tail.next=a;
                a=a.next;
            }
            else {
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }

        if(a==null){
          tail.next=b;
        }
        else {
            tail.next=a;
        }

        return dummy.next;
    }

    public void display(ListNode head){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }


}
