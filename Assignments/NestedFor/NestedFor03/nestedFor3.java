/*
10 
9 8 
7 6 5 
4 3 2 1 
 */

import java.util.*;
public class nestedFor3 {
    public static void main(String[] args) {
        System.out.println("Enter rows");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num =10;
        for(int i=1; i<=rows; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num = num-1;
            }
            System.out.println();
        }
    }
}
