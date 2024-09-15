/*
10 
10 9 
9 8 7 
7 6 5 4 
 */


import java.util.Scanner;

public class nestedfor3 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        //int num = (rows*(rows+1))/2;
        int num = 10;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num-- +" ");
            }
            num++;
            System.out.println();
        }
    }
        
}
