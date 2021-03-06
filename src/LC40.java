import java.util.*;

//DFS_SET
class Solution40 {
    private static Set<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new HashSet<>();
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++) {

        }
        DFS(candidates, target, new ArrayList<>(), 0, 0);
        return new ArrayList<>(res);
    }

    private void DFS(int[] candidates, int target, List<Integer> list, int sum, int begin) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
        } else {
            for (int i = begin; i < candidates.length; i++) {
                if (candidates[i] + sum <= target) {
                    list.add(candidates[i]);
                    DFS(candidates, target, list, sum + candidates[i], i);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}



public class LC40 {
}
