import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.lang.reflect.Array;
import java.util.*;

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if (nums.length == 0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    System.out.println("!");
                    List<Integer> a = Arrays.asList(nums[i], nums[j++], nums[k--]);
                    res.add(a);
                } else if (sum > 0) k--;
                else if (sum < 0) j++;
            }

        }
        System.out.println(res.size());
        return new ArrayList<>(res);
    }
}

public class Lc15 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(1, 2, 3);
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(a==b);
        Map<List<Integer>, Integer> m = new HashMap<>();
        m.put(a, 1);
        m.put(b, 2);
    }
}
