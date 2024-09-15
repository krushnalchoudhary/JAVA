/*
C2W10 
C2W9 C2W8 
C2W7 C2W6 C2W5 
C2W4 C2W3 C2W2 C2W1 
 */

import java.util.Scanner;

public class nestedfor1 {
    public static void main(String[] args) {
        
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num = (rows*(rows+1))/2;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("C2W"+num-- +" ");
            }
            System.out.println();
        }
    }
}
