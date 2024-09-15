/*
A B C D 
B C D 
C D 
D 
 */

import java.util.Scanner;

public class nestedfor5 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        char ch = 'A';

        for(int i=1; i<=rows; i++){
            char ch1 = ch;
            for(int j=i; j<=rows; j++){
                System.out.print(ch1+" ");
                ch1++;
            }
            ch++;
            System.out.println();
        }
    }
}
