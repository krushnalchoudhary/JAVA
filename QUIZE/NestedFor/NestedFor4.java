/*
4 4 4  
3 3 3  
2 2 2  
1 1 1 
 */


public class NestedFor4 {
    public static void main(String[] args) {
        int num = 4;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=3; j++){
                System.out.print(num+" ");
            }
            System.out.println(" ");
            num--;
        }
     
    }
}
