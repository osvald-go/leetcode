package 双指针;

import utils.ListNode;

/**
 * 141. Linked List Cycle (Easy)
 */
public class hasCycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
//        node3.next = node1;
        node3.next = null;

        boolean b = hasCycle(node1);
        System.out.println(b);
    }
    private static boolean hasCycle(ListNode head){
        if (head == null){
            return false;
        }
        ListNode l1 = head,l2 = head.next;
        while (l1!=null && l2!=null && l2.next!=null){
            if (l1 == l2){
                return true;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;
    }
}
