/*
1 
3 4 
6 7 8 
10 11 12 13 
15 16 17 18 19 
 */


import java.util.Scanner;

public class nestedfor2 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num =1;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num++ +" ");

            }
            num++;
            System.out.println();
        }
    }
}
