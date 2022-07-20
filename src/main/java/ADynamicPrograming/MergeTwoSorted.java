package ADynamicPrograming;

public class MergeTwoSorted {
    public static void main(String[] args) {
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
        MergeTwoSorted mergeTwoSorted = new MergeTwoSorted();

        mergeTwoSorted.extracted();
    }

    private void extracted() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=null;

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next=l22;
        l22.next = l23;
        mergeTwoLists(l1,l2);
    }

    private void mergeTwoLists(ListNode l1, ListNode l2) {
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

