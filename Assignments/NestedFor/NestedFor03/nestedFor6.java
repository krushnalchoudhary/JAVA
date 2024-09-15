/*
9 
9 8 
9 8 7 
9 8 7 6  
*/

import java.util.*;
public class nestedFor6 {
    public static void main(String[] args) {
        System.out.println("Enter rows");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        
        for(int i=1; i<=rows; i++){
            int num =9;
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num = num-1;
            }
            System.out.println();
        }
    }
}