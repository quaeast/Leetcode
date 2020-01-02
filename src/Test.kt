import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var i:Int = 1;
    var list: ArrayList<ListNode> = ArrayList(1);
    list.add(ListNode(2))
    println(list[0])
    list.removeAt(0)
    print(list.size)
}