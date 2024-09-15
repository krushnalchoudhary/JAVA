/*
4 3 2 1 
4 3 2 1 
4 3 2 1 
 */


public class NestedFor3 {
    public static void main(String[] args) {
        int num;

        for(int i=1; i<=3; i++){
            num = 4;
            for(int j=1; j<=4; j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}
