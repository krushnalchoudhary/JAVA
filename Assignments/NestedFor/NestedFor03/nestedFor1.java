/*
C2W 
C2W C2W 
C2W C2W C2W 
C2W C2W C2W C2W 
 */


import java.util.*;

public class nestedFor1 {
    public static void main(String[] args) {

        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("C2W ");
            }
            System.out.println();
        }
    }
}
