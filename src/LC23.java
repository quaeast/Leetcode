import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */


//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//    }
//}

class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (ListNode i : lists) {
            ListNode cur = i;
            while (cur != null) {
                System.out.println(cur.val);
                pq.add(cur.val);
                cur = cur.next;
            }
        }
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (!pq.isEmpty()) {
            cur.next = new ListNode(pq.poll());
            cur = cur.next;
        }
        return res.next;
    }
}


public class LC23 {
}
