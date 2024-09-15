/*
 write a program to print the following pattern
0
1 1
2 3 5
8 13 21 34
 */

 import java.io.*;
public class Nestedfor5_5 {
    public static void main(String[] args)throws IOException{
        int num1 = 0; int num2 = 1; int num3 = 0;
        System.out.println("Enter rows");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int row = Integer.parseInt(br.readLine());

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                num1 = num3;
                num3 = num2;

                System.out.print(num1+" ");

                num2 = num1 + num3;

            }
            System.out.println();
        }
        
    }
}
