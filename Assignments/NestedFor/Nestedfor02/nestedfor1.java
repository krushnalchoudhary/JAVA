/*
C2W1 C2W2 C2W3 
C2W1 C2W2 C2W3 
C2W1 C2W2 C2W3  */

import java.util.*;
public class nestedfor1 {
    public static void main(String[] args){
        int r;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
            int num=1;
            for(int j=1; j<=c; j++){
                System.out.print("C2W"+num+" ");
                num++;
            }
            System.out.println();
        }


    
    }
}
