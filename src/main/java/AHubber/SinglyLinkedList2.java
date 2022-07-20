package AHubber;

public class SinglyLinkedList2 {

    private ListNode head;

    static class ListNode {
        private int data; //data type generic
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList2 sl1 = new SinglyLinkedList2();
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
        sl1.insertAtGivenPositionFirst (90);
        sl1.display();
        sl1.insertAtGivenPositionEnd (100);
        sl1.display();
        sl1.insertAtGivenPosition(2,13,6);
        sl1.display();
        ListNode listNode = sl1.deleteFirst();
        System.out.println(listNode.data);
        sl1.display();
        ListNode listNode1 = sl1.deleteLast();
        System.out.println(listNode1.data);
        sl1.display();
        sl1.deleteAtSpecifiedPoition(3);
        sl1.display();

    }

    public boolean SearchElement(int val){
        ListNode current = head;
        while(current!=null){
            if(current.data== val){
                return true;
            }
            current = current.next;
        }
        return false;
    }



    public void deleteAtSpecifiedPoition(int position){

        if(position==1){
            head = head.next;
        }
        else{
            ListNode previous = head;
            int count =1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next=current.next;
        }

    }

    public ListNode deleteLast(){
        if(head==null || head.next ==null) return head;
        ListNode current = head;
        ListNode previous = null;
        while(current.next!=null){
            previous = current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }


    public ListNode deleteFirst(){
        if(head==null) return null;
        ListNode temp = head;
        head = head.next;
        temp.next=null;
        return temp;

    }


    public void insertAtGivenPosition(int position , int value, int length){
        if(position<0 || position>length) return;
        ListNode newNode = new ListNode(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }else {
            ListNode previous = head;
            int count =1; //position -1
            while(count<position-1){
                previous =previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next= newNode;
            newNode.next=current;

        }

    }
    public void insertAtGivenPositionEnd(int value){
        ListNode newNode = new ListNode(value);

        if(head==null){
            head = newNode;
        }
        ListNode current = head;
        while(current.next!=null){
        current = current.next;
        }
        current.next= newNode;
        newNode.next=null;
    }

    public void insertAtGivenPositionFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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
