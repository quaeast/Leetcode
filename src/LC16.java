

class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        long min=Integer.MAX_VALUE;
        for (int i=0;i<nums.length-2;i++){
            for (int j=i+1;j<nums.length-1;j++){
                for (int k=j+1;k<nums.length;k++){
                    long t = nums[i]+nums[j]+nums[k];
                    min = Math.abs(t-target)<Math.abs(min-target)?t:min;
                }
            }
        }
        return (int) min;
    }
}

public class LC16 {
    public static void main(String[] args){
        Solution16 s = new Solution16();
        int[] a = {1,1,-1,-1,3};
        int res = s.threeSumClosest(a, -1);
        System.out.println(res);
    }
}

//[]
//        -1