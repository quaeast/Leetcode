import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        for (ListNode i = headA; i != null; i = i.next){
            lenA++;
        }
        for (ListNode i = headB; i != null; i = i.next){
            lenB++;
        }
        int minus = Math.abs(lenA-lenB);
        ListNode cur1, cur2;
        if (lenA>lenB){
            cur1=headA;
            cur2=headB;
        }else {
            cur1=headB;
            cur2=headA;
        }
        for (int i=0;i<minus;i++){
            cur1=cur1.next;
        }
        while (true){
            if (cur1.val==cur2.val){
                return cur1;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
    }
}

public class LC160 {
    public static void main(String[] args){
        Solution160 solution160 = new Solution160();
        solution160.getIntersectionNode(null, null);
    }
}
