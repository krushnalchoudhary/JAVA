/*
1 2 3 4 
4 5 6 
6 7 
7 
 */

import java.util.Scanner;

public class nestedFor10 {
    public static void main(String[] args) {
        System.out.println("Enter rows");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int num =1;

        for(int i=1; i<=rows; i++){
            for(int j=i; j<=rows; j++){
                System.out.print(num+" ");
                num++;
            }
            num--;
            System.out.println();
        }
    }
}
