import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Test{
    public static int fac(int n){
        if (n<=0){
            return 1;
        }
        int res=1;
        for (int i=1;i<n;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args){
        String s0 = "fang";
        String s1 = "fang";
        String s2 = s0;
        String s3 = new String("fang");
        System.out.println();
    }
}