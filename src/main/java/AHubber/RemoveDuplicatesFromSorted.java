package AHubber;

import org.w3c.dom.NodeList;

import java.util.List;

public class RemoveDuplicatesFromSorted {
     ListNode head;
    static class ListNode{
        private int data;
        private  ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSorted f1 = new RemoveDuplicatesFromSorted();
         ListNode head = new  ListNode(1);
         ListNode first = new  ListNode(2);
         ListNode second = new  ListNode(2);
         ListNode third = new  ListNode(6);
         ListNode fourth = new  ListNode(8);
        f1.head = head;
        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
      f1.display(head);
       f1.removeDuplicates();
     f1.display(head);
     f1.insertNodeAtSortedPosition(4);
     f1.display(head);
     ListNode nodes = f1.removeGivenKey(6);

       // System.out.println(nodes.data);
    }

    public void removeLoops(){
        ListNode fastPr = head;
        ListNode slowPr = head;
        while (fastPr!=null && fastPr.next!=null){
            fastPr = fastPr.next.next;
            slowPr= slowPr.next;
            if(slowPr==fastPr){
                removeLoop(slowPr);
                return;
            }
        }
    }
    public void removeLoop(ListNode slowPr){
        ListNode temp = head;
        while (slowPr.next!=temp.next){
            temp=temp.next;
            slowPr=slowPr.next;
        }
        slowPr.next=null;
    }

    public ListNode findStartOfLoop(){
        ListNode fastPr = head;
        ListNode slowPr = head;
        while(fastPr!=null && fastPr.next!=null){
            fastPr= fastPr.next.next;
            slowPr= slowPr.next;
            if(slowPr==fastPr){
                return getStartingNode(slowPr);
            }
        }
        return null;
    }
    public ListNode getStartingNode(ListNode slowPr){
        ListNode temp = head;
        while (slowPr!=temp){
            temp= temp.next;
            slowPr= slowPr.next;
        }
        return temp;
    }
    public boolean detectLoop(){
        ListNode fastPr =head;
        ListNode slowPr = head;
        while (fastPr!=null && fastPr.next!=null){
            fastPr = fastPr.next.next;
            slowPr = slowPr.next;
            if(slowPr==fastPr){
                return true;
            }
        }
        return false;
    }

    public ListNode removeGivenKey(int key){
        ListNode current = head;
        ListNode temp = null;
        while (current!=null && current.data!=key){
            temp = current;
            current=current.next;
        }
        if(current==null) {return null;}
        temp.next= current.next;
        return head;
    }

    public ListNode insertNodeAtSortedPosition(int  value){
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;
        while (current!=null && current.data<newNode.data){
            temp = current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;
        return temp;
    }
    public void removeDuplicates(){
        ListNode current = head;
        while (current!=null && current.next!=null){
            if(current.data== current.next.data){
                current.next= current.next.next;
            }
            else {
                current=current.next;
            }
        }
       // return current;
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
