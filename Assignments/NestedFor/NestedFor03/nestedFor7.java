/*
F 
E F 
D E F 
C D E F 
B C D E F 
A B C D E F 
 */

import java.util.Scanner;

public class nestedFor7{
    public static void main(String[] args) {
        System.out.println("Enter rows");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        char ch = 'F';

        for(int i=1; i<=rows; i++){
            char ch1 = ch;

            for(int j=1; j<=i; j++){
                System.out.print(ch1+" ");
                ch1++;
            }
            ch--;
            System.out.println();
        }
    }
}