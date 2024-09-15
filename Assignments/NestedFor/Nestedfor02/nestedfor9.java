/*
 1C3 4B2 9A1 
16C3 25B2 36A1 
49C3 64B2 81A1 
 */


 
import java.util.*;
public class nestedfor9 {
    public static void main(String[] args){
        int r;
        int c;
        int num=1;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
            char ch = 'C'; int a = 3;
            for(int j=1; j<=c; j++){
                System.out.print(num*num);
                System.out.print(ch);
                System.out.print(a+" ");
                ch--;
                a--;
                num++;
                
            }

            System.out.println();
        }


    
    }
}


