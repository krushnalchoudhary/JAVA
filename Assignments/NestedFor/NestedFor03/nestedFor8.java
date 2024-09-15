/*
J 
I H 
G F E 
D C B A 
 */

import java.util.Scanner;

public class nestedFor8 {
    public static void main(String[] args) {
        
        System.out.println("Enter rows");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        char ch = 'J';

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
