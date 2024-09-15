/*
Write a program to take a range as input from the user and print perfect squares between that range.
Input: Enter start: 1
Enter end: 100
 */

import java.io.*;
public class Nestedfor6_3 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Starting Number");
        int str = Integer.parseInt(br.readLine());

        System.out.println("Enter ending number");
        int end = Integer.parseInt(br.readLine());

         for(int i=str; i<=end; i++){

            for(int j=1;j<=i; j++){

                if(j*j==i){
                    System.out.print(i+" ");
                }
            }
        }  
    }
} 
