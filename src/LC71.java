import java.util.ArrayList;

class Solution71 {
    public String simplifyPath(String path) {
        if (path.length() == 0) {
            return path;
        }
        ArrayList<String> pathList = new ArrayList<>();
        int len = 0;
        String[] pathArray = path.split("/");
        for (String i : pathArray) {
            if (i.length() == 0 | i.equals(".")) {
                continue;
            }
            if (i.equals("..")) {
                len = Math.max(0, len - 1);
            } else {
                pathList.add(len, i);
                len++;
            }
        }
        StringBuffer resString = new StringBuffer();
        for (int i = 0; i < len; i++) {
            resString.append('/');
            resString.append(pathList.get(i));
        }
        if (resString.length() == 0) {
            return "/";
        }
        return resString.toString();
    }
}


public class LC71 {
    public static void main(String[] args) {
        Solution71 solution71 = new Solution71();
        String res = solution71.simplifyPath("/home");
        System.out.println(res);
    }
}
