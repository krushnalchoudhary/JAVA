/*
a b c a b c a b c 
a b c a b c a b c 
a b c a b c a b c 
 */


public class NestedFor6 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.print("a"+" ");
                System.out.print("b"+" ");
                System.out.print("c"+" ");
            }
            System.out.println();
        }
    }
}
