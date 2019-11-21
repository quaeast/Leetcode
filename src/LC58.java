class Solution58 {
    public int lengthOfLastWord(String s) {
        boolean flag = false;
        int res=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (flag&&s.charAt(i)==' '){
                break;
            }

            if(s.charAt(i)!=' '){
                flag = true;
                res++;
            }
        }
        return res;
    }
}

public class LC58 {
    public static void main(String[] args){
        Solution58 s= new Solution58();
        int a = s.lengthOfLastWord("hello world");
        System.out.print(a);
    }
}
