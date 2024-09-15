/*
 Write a program to print the sum of all even numbers and
multiplication of odd numbers between 1 to 10.
Output: sum of even numbers between 1 to 10 = 30
Multiplication of odd numbers between 1 to 10 = 945
 */

import java.io.*;
public class while6 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number upto which you want to print sum and Multiplication of odd and even");
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int mult = 1;
        int temp;
        while(num>0){
            if(num%2!=0){
                mult = mult * num;
            }else{
                sum = sum+num;
            }
           num--;
        }
        System.out.println("Sum of Odd number " +sum);
        System.out.println("Multiplication of Even nmbers "+mult);
    }
}
