import java.util.ArrayList;
import java.util.List;

class Solution28 {
    private static int[] get_pmt(String son) {
        int[] pmt = new int[son.length()+1];
        pmt[0] = 0;
        int i = 1;
        int j = 0;
        while (i < son.length()) {
            if (son.charAt(i) != son.charAt(j)) {
                if (j == 0) {
                    pmt[i] = j;
                    i++;
                } else {
                    j = pmt[j - 1];
                }
            } else {
                j++;
                pmt[i] = j;
                i++;
            }
        }
        return pmt;
    }

    public int strStr(String haystack, String needle) {
        int[] pmt = get_pmt(needle);
        int i = 0;
        int j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = pmt[j - 1];
                    i--;
                }
            } else {
                j++;
            }
            i++;
        }
        if (j == needle.length()) {
            return i - j;
        } else {
            return -1;
        }
    }
}

public class LC28 {
}
