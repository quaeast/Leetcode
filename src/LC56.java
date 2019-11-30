import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
[[1,3],[2,6],[8,10],[15,18]]
[[1,4],[0,4]]
[[1,4],[2,3]]
[]
 */

class Solution56 {
    public int[][] merge(int[][] intervals) {
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
}

public class LC56 {
    public static void main(String[] args){
        int [][] a = {{7, 2},{3, 4},{5, 6}};
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        System.out.print(a);
    }
}
