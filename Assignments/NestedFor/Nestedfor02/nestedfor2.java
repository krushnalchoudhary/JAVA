/*
4 4 4 4 
5 5 5 5 
6 6 6 6 
7 7 7 7  */




    import java.util.*;
    public class nestedfor2{
        public static void main(String[] args){
            int r;
            int c;
            int num=4;


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter rows");
            r = sc.nextInt();
            System.out.println("Enter columns");
            c = sc.nextInt();
    
            for(int i=1; i<=r; i++){
                for(int j=1; j<=c; j++){
                    System.out.print(num+" ");
                }
                num++;

                System.out.println();
            }
    
    
        
        }
    }
    
