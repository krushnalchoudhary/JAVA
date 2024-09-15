/*
1 1 1 

2 2 2 

3 3 3 

4 4 4  */
public class NestedFor2 {
    public static void main(String[] args) {
        int num = 4;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=3; j++){
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
    }
}
