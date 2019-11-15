import java.math.BigInteger;
import java.util.Arrays;

class Solution43 {
    public String add(String nums1, String nums2) {
        int[] res = new int[nums1.length() + nums2.length()];
        int cur = 0;
        int k = 0;
        for (int i = nums1.length() - 1, j = nums2.length() - 1; ; i--, j--) {
            if (i >= 0 && j >= 0) {
                int sum = (nums1.charAt(i) - '0') + (nums2.charAt(j) - '0') + cur;
                res[k++] = sum % 10;
                cur = sum / 10;
            } else if (i >= 0) {
                int sum = (nums1.charAt(i) - '0') + cur;
                res[k++] = sum % 10;
                cur = sum / 10;
            } else if (j >= 0) {
                int sum = (nums1.charAt(j) - '0') + cur;
                res[k++] = sum % 10;
                cur = sum / 10;
            } else if (cur != 0) {
                res[k++] = cur;
                break;
            } else {
                break;
            }
        }
        return res.toString();
    }

    public String multiply(String num1, String num2) {
        StringBuffer res = new StringBuffer(num1.length() + num2.length());
        return "";
    }
}

class Solution43_2{
    public String multiply(String num1, String num2){
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.multiply(n2).toString();
    }
}

public class LC43 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println();
    }
}
