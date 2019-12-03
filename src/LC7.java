class Solution7 {
    public int reverse(int x) {
        StringBuffer res = new StringBuffer();
        if (x < 0) {
            res.append('-');
        }
        while (x != 0) {
            res.append(x % 10);
            x /= 10;
        }
        System.out.println(res.toString());
        try {
            return Integer.parseInt(res.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}

class Solution7_2 {
    public int reverse(int x) {
        long a = x;
        if (x > 0) {
            long b = 0;
            while (a != 0) {
                b *= 10;
                b += a%10;
                a /= 10;
                if (b > Integer.MAX_VALUE) {
                    return 0;
                }
            }
            return (int) b;
        } else {
            a=-a;
            long b = 0;
            while (a != 0) {
                b *= 10;
                b += a%10;
                a /= 10;
                if (-b < Integer.MIN_VALUE) {
                    return 0;
                }
            }
            return (int) -b;
        }
    }
}

/*
123
-123
120
1234567899
-2147483648
 */

public class LC7 {
    public static void main(String[] args) {
        Solution7_2 s = new Solution7_2();
        int a = s.reverse(-2147483648);
        System.out.println(a);
    }
}
