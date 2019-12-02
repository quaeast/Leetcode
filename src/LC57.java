import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution57 {
    private int[][] merge(int[][] intervals) {
        if (intervals.length==0){
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[]> res = new ArrayList<>();
        int [] temp = intervals[0].clone();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]<=temp[1]){
                if(temp[1]<intervals[i][1]){
                    temp[1]=intervals[i][1];
                }else {
                    continue;
                }
            }else {
                res.add(temp);
                temp = intervals[i].clone();
            }
        }
        res.add(temp);
        int[][] arrayRes = new int[res.size()][2];
        return res.toArray(arrayRes);
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        Collections.addAll(res, intervals);
        res.add(newInterval);
        int [][] arrRes = new int[intervals.length+1][2];
        res.toArray(arrRes);
        return merge(arrRes);
    }
}

/*
[[1,3],[6,9]]
[2,5]
[[1,2],[3,5],[6,7],[8,10],[12,16]]
[4,8]
[[1,5]]
[2,7]
[]
[]
[]
[5,7]
 */

public class LC57 {
    public static void main(String[] args) {
        Solution57 solution57 = new Solution57();
        int[][] inter = {{1, 3}, {6, 9}};
        int[] newInter = {2, 5};
        int[][] res = solution57.insert(inter, newInter);
    }
}