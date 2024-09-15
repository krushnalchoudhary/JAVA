

public class ArrayasArgs2 {

    int fun(int x){
        int val = x +50;
        return val;
    }
    public static void main(String[] args){
        ArrayasArgs2 obj = new ArrayasArgs2();
        int ret = obj.fun(10);
        System.out.println(ret);
    }
}
