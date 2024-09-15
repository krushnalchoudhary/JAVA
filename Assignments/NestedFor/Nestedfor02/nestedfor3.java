/*
14 15 16 17 
15 16 17 18 
16 17 18 19 
17 18 19 20  */



import java.util.*;
public class nestedfor3 {
    public static void main(String[] args){
        int r;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){

            int num=0;
            num = i+13;
            for(int j=1; j<=c; j++){
               
                System.out.print(num+" ");
                num++;
            }
            

            System.out.println();
        }


    
    }
}

