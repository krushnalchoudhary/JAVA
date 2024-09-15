/*
Write a program to print the square of even digits of the

given number.
Input: 942111423
Output: 4 16 4 16
 */

 import java.io.*;
public class while5 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int temp;
        while(num!=0){
            temp = num%10;
            if(temp%2==0){
                System.out.print(temp * temp +" ");
            }
            num = num/10;
        }
    }
}
