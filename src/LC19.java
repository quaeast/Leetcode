class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode isEnd = head;
        ListNode target = head;
        for (int i = 0; i < n-1; i++) {
            isEnd  = isEnd.next;
        }
        while (isEnd!=null){
            isEnd = isEnd.next;
            target = target.next;
        }
        target.next = target.next.next;
        return head;
    }
}

public class LC19 {
}
