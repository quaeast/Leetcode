import java.lang.reflect.Array;
import java.util.*;

//DFS_BAD
class Solution39 {
    private static Set<List<Integer>> res = null;

    private int sum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    private void DFS(int[] candidates, int target, ArrayList<Integer> list) {
        int listSum = sum(list);
        if (listSum == target) {
//            list.sort(Comparator.naturalOrder());
            res.add(list);
            return;
        } else if (listSum > target) {
            return;
        }
        for (int i : candidates) {
            ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
            newList.add(i);
            DFS(candidates, target, newList);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        DFS(candidates, target, list);
        return new ArrayList<>(res);
    }
}


//DFS_OPTIMIZED
class Solution39_2 {
    private static List<List<Integer>> res;

    private void DFS(int[] candidates, int target, List<Integer> list, int sum, int begin) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
        } else {
            for (int i = begin; i < candidates.length; i++) {
                if(sum+candidates[i]>target){
                    return;
                }else {
                    list.add(candidates[i]);
                    DFS(candidates, target, list, sum+candidates[i], i);
                    list.remove(list.size()-1);
                }
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        DFS(candidates, target, new ArrayList<>(), 0, 0);
        return res;
    }
}


public class LC39 {
}
