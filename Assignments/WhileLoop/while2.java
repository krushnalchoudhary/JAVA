/*
 * Write a program to calculate the factorial of the given
number.
Input: 6
Output: factorial 6 is 720
 */

import java.io.*;
public class while2 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());
        int i=1;
        int fact=1;
        while(i<=num){
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of Entered number "+fact);
    }
}
