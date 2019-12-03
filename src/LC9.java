class Solution9 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int a = x;
        int b = 0;
        while (x!=0){
            b*=10;
            b+=x%10;
            x/=10;
        }
        return a==b;
    }
}

public class LC9 {
}
