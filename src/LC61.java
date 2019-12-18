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
        if (length == 0 || k % length == 0) {
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

class Solution61_1 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int length = 1;
        ListNode currentTemp = head;
        while (currentTemp.next != null) {
            length++;
            currentTemp = currentTemp.next;
        }
        k %= length;
        currentTemp.next = head;
        for (int i = 0; i < length - k; i++) {
            currentTemp = currentTemp.next;
        }
        head = currentTemp.next;
        currentTemp.next = null;
        return head;
    }
}

public class LC61 {
    public static void main(String[] args) {
    }
}
