import java.util.*;

public class Main {
    public static void main(String[] args) {

    }


    public static  class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return calculateNextNode(list1, list2);
    }

    private ListNode calculateNextNode(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return  null;
        }
        if (list1 == null) {
            return new ListNode(list2.val, calculateNextNode(null, list2.next));
        } else if (list2 == null) {
            return new ListNode(list1.val, calculateNextNode(list1.next, null));
        } else {
            if (list1.val < list2.val) {
                return new ListNode(list1.val, calculateNextNode(list1.next, list2));
            } else {
                return new ListNode(list2.val, calculateNextNode(list1, list2.next));
            }
        }
    }


}