/*
1 
8 27 
64 125 216  
 */

import java.util.Scanner;

public class nestedFor9 {
    public static void main(String[] args) {
         System.out.println("Enter rows");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

         int num =1;
        for(int i=1; i<=rows; i++){
           
            for(int j=1; j<=i; j++){
                System.out.print(num*num*num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
