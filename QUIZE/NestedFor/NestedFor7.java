/*
R R R 
Q Q Q 
P P P 
 */


public class NestedFor7 {
    public static void main(String[] args) {
        char ch = 'R';
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.print(ch+" ");
                
            }
            System.out.println();
            ch--;
        }
    }
}
