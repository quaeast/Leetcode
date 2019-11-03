class Pair extends Object{
    int a;
    int b;

    Pair(){}
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj){
        Pair that = (Pair) obj;
        if(this.a==that.a&&this.b==that.b){
            return true;
        }else {
            return false;
        }
    }
}
public class Test {
    public static void swap(Integer a, Integer b){
        int t = a;
        a = b;
        b = a;
    }
    public static void main(String[] args){
        int a=10;
        int b=11;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}
