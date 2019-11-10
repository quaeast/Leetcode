import java.util.*;

//DFS
class Solution39 {
    private static Set<List<Integer>> res=null;

    private int sum(List<Integer> list){
        int sum=0;
        for (int i:list){
            sum+=i;
        }
        return sum;
    }

    private void DFS(int[] candidates, int target, ArrayList<Integer> list){
        int listSum = sum(list);
        if(listSum==target){
            list.sort(Comparator.naturalOrder());
            res.add(list);
            return;
        }else if(listSum>target){
            return;
        }
        for (int i:candidates){
            ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
            newList.add(i);
            DFS(candidates, target, newList);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        DFS(candidates, target, list);
        return new ArrayList<>(res);
    }
}

public class LC39 {
}
