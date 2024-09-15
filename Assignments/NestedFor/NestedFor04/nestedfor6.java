/*
1 
2 3 
3 4 5 
4 5 6 7 
 */

import java.util.Scanner;
public class nestedfor6 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            int num = i;
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
