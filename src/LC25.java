import java.nio.IntBuffer;
import java.util.function.Predicate;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        int length = 0;
        for (ListNode i = head; i != null; i = i.next) {
            length++;
        }
        if (k <= 1 || head == null) {
            return head;
        }
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode pre = preHead;
        ListNode cur = pre.next;
        ListNode next = cur.next;
        ListNode groupPre = pre;//it has no need to init
        for (int i = 0;; i++) {
            if (i % k == 0) {
                groupPre = pre;
                if(length-i<k){
                    break;
                }
            }
            pre.next = next;
            cur.next = groupPre.next;
            groupPre.next = cur;
            if(next==null){
                break;
            }
            pre = pre.next == next ? pre : cur;
            cur = next;
            next = next.next;
        }
        return preHead.next;
    }
}

/*
        []
        1
        [1,2,3,4,5]
        0
        [1,2,3,4,5]
        1
        [1,2,3,4,5]
        2
        [1, 2, 3]
        3
        [1, 2, 3, 4]
        3
        [1,2,3,4,5]
        3
        [1, 2, 3,4 ,5, 6]
        3

 */
public class LC25 {
}
