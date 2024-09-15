/*
 * Write a program to count the digits of the given number.
Input: 942111423
Output: count of digits = 9
 */

 import java.io.*;
public class while3 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());

        int count =0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Digits in given Array are: "+count);
    }
}

