/*
 write a program to print the following pattern
Row =5;
O
14 13
L K J
9 8 7 6
E D C B A

Row = 4
10
I H
7 6 5
D C B A
 */

import java.io.*;
public class Nestedfor5_7 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the row");
         int row = Integer.parseInt(br.readLine());
         
         int num = row*(row+1)/2;

         for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){

                if(row%2==0){
                    if(i%2==0){
                        System.out.print((char) (64+num) +" ");
                        num--;
                    }else{
                        System.out.print(num+" ");
                        num--;
                    }
                }else{
                    if(i%2==0){
                        System.out.print(num+" ");
                        num--;
                    }else{
                        System.out.print((char) (64+num) +" ");
                        num--;
                    }
                }
            }
            System.out.println();

         }
    }
}
