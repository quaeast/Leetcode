import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//public
class Solution141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode pre = new ListNode(0);
        pre.next = head;
        while (pre.next!=null){
            if(set.contains(pre.next)){
                return true;
            }
            set.add(pre.next);
            pre=pre.next;
        }
        return false;
    }
}

public class LC141 {
}
