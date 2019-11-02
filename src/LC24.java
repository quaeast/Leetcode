
//Definition for singly-linked list.

class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode pre = preNode;
        ListNode cur = head;
        ListNode next = cur.next;
        while (next!=null){
            //
            cur.next = next.next;
            next.next = cur;
            pre.next = next;
            //
            if(cur.next==null){
                break;
            }
            pre = cur;
            cur = pre.next;
            next = cur.next;
        }
        return preNode.next;
    }
}


public class LC24 {
}
