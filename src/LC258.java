class Solution258 {
    public int addDigits(int num) {
        if (num == 0) {
            return num;
        }
        int res=num%9;
        return res!=0 ? res : 9;
    }
}

public class LC258 {

}
