/*
10 10 10 10 
11 11 11 
12 12 
13 
*/

import java.util.*;
public class nestedFor5 {
    public static void main(String[] args) {
        System.out.println("Enter rows");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num =10;
        for(int i=1; i<=rows; i++){
            
            for(int j=i; j<=rows; j++){
                System.out.print(num+" ");
                
            }
            num = num+1;
            System.out.println();
        }
    }
}