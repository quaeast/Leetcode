class Solution38 {
    public String countAndSay(String n) {
        int flag = 1;
        StringBuffer res = new StringBuffer();
        for (int i = 1; i < n.length(); i++) {
            if(n.charAt(i)==n.charAt(i-1)){
                flag++;
            }else{
                res.append(Integer.toString(flag));
                res.append(n.charAt(i-1));
                flag=1;
            }
        }
        if(flag!=0){
            res.append(Integer.toString(flag));
            res.append(n.charAt(n.length()-1));
        }
        return res.toString();
    }

    public String countAndSay(int n) {
        String res = "1";
        for (int i = 0; i < n - 1; i++) {
            res = countAndSay(res);
        }
        return res;
    }
}

public class LC38 {
    public static void main(String[] args){
        Solution38 s = new Solution38();
        System.out.println(s.countAndSay(5));
    }
}
