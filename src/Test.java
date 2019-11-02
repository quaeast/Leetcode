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
    public static void main(String[] args){
        Pair a = new Pair(1, 2);
        Pair b = new Pair(1, 2);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
