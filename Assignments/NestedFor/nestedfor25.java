/*
14 15 16 17 
15 16 17 18 
16 17 18 19 
17 18 19 20  */


public class nestedfor10 {
    public static void main(String[] args){
int num =0;
        for(int i=1; i<=4; i++){
            
                num = i+13;
            for(int j=1; j<=4; j++){
                
                System.out.print(num+" ");
                num++;

            }
             System.out.println();
        }
    }
}