/*
Write a program to take range as input from the user and print the reverse of all numbers. ( Take a
start and end number from a user )
Input: Enter start: 100
Enter end: 200
 */



 import java.io.*;
 public class Nestedfor6_8 {
     public static void main(String[] args)throws IOException{
 
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
 
         System.out.println("Enter Starting number");
         int str = Integer.parseInt(br.readLine());
 
         System.out.println("Enter ending Number");
         int end = Integer.parseInt(br.readLine());
 
         for(int i= str; i<=end; i++){
             int num = i;
             int sum = 0;
             while(num!=0){
                 int x =num%10;
                 sum = sum*10+x;
                 num = num/10;
             }
             System.out.println(sum+" ");
             }
         }
     }
 
 
