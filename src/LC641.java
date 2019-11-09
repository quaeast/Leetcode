class MyCircularDeque {

    private int[] values;
    private int len = 0;
    private int rlen = 0;
    private int beg = 0;
    private int end = 0;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        len = k;
        values = new int[k];
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (this.isFull()) {
            return false;
        }
        beg = (beg - 1 + len) % len;
        values[beg] = value;
        rlen++;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (this.isFull()) {
            return false;
        }
        values[end] = value;
        end = (end + 1) % len;
        rlen++;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (this.isEmpty()) {
            return false;
        }
        beg = (beg + 1) % len;
        rlen--;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (this.isEmpty()) {
            return false;
        }
        end = (end - 1 + len) % len;
        rlen--;
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if(this.isEmpty()){
            return -1;
        }
        return values[beg];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (this.isEmpty()){
            return -1;
        }
        return values[(end - 1 + len) % len];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return rlen == 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return rlen == len;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

public class LC641 {

    public static void main(String[] args){
        MyCircularDeque mq = new MyCircularDeque(4);
        mq.insertFront(9);
        mq.deleteLast();
    }
}
