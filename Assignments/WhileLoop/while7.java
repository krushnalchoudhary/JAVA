/*
Write a program which take’s number from user’s if number is even
print that number in reverse order or if number is odd print that number in
reverse order by difference two?
Input:6
output:6 5 4 3 2 1
Input:7
output:7 5 3 1.
 */

import java.io.*;
public class while7 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Number");
        int num = Integer.parseInt(br.readLine());

        if(num%2==0){
            while(num>0){
                System.out.print(num +" ");
                num--;
            }
        }else{
            while(num>0){
                System.out.print(num +" ");
                num = num-2;
            }
        }
    }
}
