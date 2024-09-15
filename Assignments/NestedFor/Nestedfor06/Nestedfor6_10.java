/*
 Write a program to take range as input from the user and print Armstrong numbers. (Take a start and end number from a user)

Input: Enter start: 1 Enter end: 1650

I

Output: Armstrong numbers between 1 and 1650 
1 2 3 4 5 6 7 8 9 153 370 371 407 1634
 */

import java.io.*;
public class Nestedfor6_10 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the starting number");
        int str = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending number");
        int end = Integer.parseInt(br.readLine());

        for(int i=str; i<=end; i++){
            int num=i;
            int count=0;
            int sum=0;
            while(num!=0){
                count++;
                num=num/10;
            }
            int temp = i;
            while(temp!=0){
                int mult = 1;
                int num2 = temp%10;
                for(int j=1; j<=count; j++){
                    mult = mult*num2;
                }
                sum = sum+mult;
                temp = temp/10;
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        }
    }
}
