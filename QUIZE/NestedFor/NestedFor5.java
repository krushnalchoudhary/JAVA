/*
1 2 3  
1 2 3  
1 2 3  
1 2 3
 */


public class NestedFor5 {
    public static void main(String[] args) {
        int num = 4;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=3; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
