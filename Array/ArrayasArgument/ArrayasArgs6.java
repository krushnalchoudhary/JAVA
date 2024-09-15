public class ArrayasArgs6 {
    static void fun(int xarr[]){
        for(int x : xarr){
            System.out.println(x);
        }
    }

    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};

        fun(arr);
    }
}
