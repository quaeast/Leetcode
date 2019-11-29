class Solution70 {
    private int res;
    private void climbStairs0(int n){
        if(n==0){
            res++;
            return;
        }else if(n<0){
            return;
        }
        climbStairs0(n-1);
        climbStairs0(n-2);
    }

    public int climbStairs(int n) {
        res = 0;
        climbStairs0(n);
        return res;
    }
}

class Solution70_1 {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        for (int i=0;i<n;i++){
            int t = first;
            first = second;
            second = second + t;
        }
        return first;
    }
}

public class LC70 {
    public static void main(String[] args){
        Solution70_1 s = new Solution70_1();
        System.out.println(s.climbStairs(99));
    }
}
