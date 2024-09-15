/*
 * Write a program to count the Odd digits of the given number.
Input: 942111423
Output: count of odd digits = 5
 */

 import java.io.*;
public class while4 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int temp;
        while(num!=0){
            temp = num%10;
            if(temp%2!=0){
                count++;
            }
            num = num/10;
        }
        System.out.println("Count of Odd digits in Entered number is "+count);
    }
}
