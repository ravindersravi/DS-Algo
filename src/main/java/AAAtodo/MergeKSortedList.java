package AAAtodo;

import ADynamicPrograming.CreatingSinglyLinkedList;

import java.util.PriorityQueue;

public class MergeKSortedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        MergeKSortedList m1 = new MergeKSortedList();


    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length, (a, b)-> a.val-b.val);

        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;

        for(ListNode node: lists)
            if(node!=null)
                queue.add(node);


        while(!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;

            if(tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }
}
