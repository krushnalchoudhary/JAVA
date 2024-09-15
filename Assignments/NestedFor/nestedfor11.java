/*
1 4 9 
16 25 36 
49 64 81  */

import java.util.*;

public class nestedfor11 {
    public static void main(String[] args){
        int num = 1;
        int r;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(num*num+" ");
                num++;
            }
            System.out.println();
        }


    }
}
