/*
A B C 
A B C 
A B C 

 */

public class NestedFor1 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            char ch = 'A';
            for(int j=1; j<=3; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
