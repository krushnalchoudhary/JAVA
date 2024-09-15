/*
1 2 3 4 
2 3 4 
3 4 
4 
 */

import java.util.Scanner;

public class nestedfor4 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        

        for(int i=1; i<=rows; i++){
            int num = i;
            for(int j=i; j<=rows; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
        
}
