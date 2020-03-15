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
        System.out.println(fac(8));
    }
}