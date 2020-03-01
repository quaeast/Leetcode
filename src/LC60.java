import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution60 {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>(n);
        int unit_size = 1;
        StringBuffer result = new StringBuffer(n);
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
            unit_size *= i + 1;
        }
        k-=1;
        for (int i = 0; i < n-1; i++) {
            unit_size = unit_size/list.size();
            result.append(list.get(k/unit_size));
            list.remove(k/unit_size);
            k=k%unit_size;
            System.out.println(k);
        }
        result.append(list.get(0));
        return new String(result);
    }
}

public class LC60 {
    public static void main(String[] args) {

    }
}
