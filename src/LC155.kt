class MinStack() {

    /** initialize your data structure here. */

    private var content:ArrayList<Int> = ArrayList(0);

    fun push(x: Int) {
        content.add(x);
    }

    fun pop() {
        content.removeAt(content.size-1)
    }

    fun top(): Int {
        return content[content.size-1]
    }

    fun getMin(): Int {
        var min:Int = Int.MAX_VALUE
        for (i: Int in content){
            min = kotlin.math.min(i, min)
        }
        return min;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */

fun main() {

}