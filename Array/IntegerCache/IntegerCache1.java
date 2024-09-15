/*
 * Integer Cache was introduced in java 1.5
 * to save Memory....
 */

public class IntegerCache1 {
    public static void main(String[] args)throws IOException{

        int x = 10;
        int y = 10;
        Integer z = 10;

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        System.out.println(System.identityHashCode(z));
    }
}


/*
 * it will give same identityHashCode for all three
 */