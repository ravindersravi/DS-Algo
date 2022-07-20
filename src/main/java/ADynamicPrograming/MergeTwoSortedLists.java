package ADynamicPrograming;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]

        LinkedLista linkedList = new LinkedLista();
        linkedList.head = new LinkedLista.ListNode(1);
        LinkedLista.ListNode second = new LinkedLista.ListNode(2);
        LinkedLista.ListNode third = new LinkedLista.ListNode(4);
        linkedList.head.next = second;
        second.next = third;
        third.next = null;

        LinkedLista linkedList1 = new LinkedLista();
        linkedList1.head = new LinkedLista.ListNode(1);
        LinkedLista.ListNode second1 = new LinkedLista.ListNode(3);
        LinkedLista.ListNode third1 = new LinkedLista.ListNode(4);
        linkedList1.head.next = second1;
        second1.next = third1;
        third1.next = null;
      //  mergeTwoLists(linkedList,linkedList1);
    }
  /*  public static LinkedLista.ListNode mergeTwoLists(LinkedLista.ListNode linkedList, LinkedLista.ListNode linkedList1){
        while ((linkedList!=null && linkedList1 !=null)){
            if(linkedList)
        }
    }*/
}
class LinkedLista{
     ListNode head;
    static class ListNode {
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
}


