/*
Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the
count of even numbers.
Input: Enter a lower limit: 1
Enter upper limit: 50
Output: 10, 20, 30, 40, 50
Count = 5
 */


import java.io.*;
public class Nestedfor6_1 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Lower Limit");
        int lwr = Integer.parseInt(br.readLine());

        System.out.println("Enter the Upper Limit ");
        int upr = Integer.parseInt(br.readLine());
        
        int count=0;
        for(int i=lwr; i<=upr; i++){
            if(i%2==0){
                if(i%5==0){
                    System.out.print(i+" ");
                    count++;
                }
            }
           
        }
        System.out.println();
        System.out.println("Count :"+count);
    }
}
