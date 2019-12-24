import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

class Solution136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sumNums = 0, sumSet = 0;
        for (int i : nums) {
            sumNums += i;
            set.add(i);
        }
        for (int i : set) {
            sumSet += i;
        }
        return 2 * sumSet - sumNums;
    }
}


public class LC136 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
    }
}
