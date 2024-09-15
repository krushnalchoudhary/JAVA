/*
Write a program to reverse the given number.
Input: 942111423
Output: 324111249
 */

 import java.io.*;
public class while9 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());
        int num1 = num;
        int revNum = 0;
        int temp;
        while(num!=0){
            temp = num%10;
            revNum = revNum * 10 + temp;
            num = num/10;
        }
        System.out.println("The reverse of number "+num1+" is "+revNum);
    }
}
