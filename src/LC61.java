/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode tail = preHead;
        ListNode newHead = preHead;
        int length = 0;
        while (tail.next != null) {
            ++length;
            tail = tail.next;
        }
        if(length==0||k%length==0){
            return head;
        }
        for (int i = 0; i < length - (k % length); i++) {
            newHead = newHead.next;
        }
        System.out.println(newHead.val);
        System.out.println(tail.val);
        preHead.next = newHead.next;
        newHead.next = null;
        tail.next = head;
        return preHead.next;
    }
}

public class LC61 {
    public static void main(String[] args){
    }
}
