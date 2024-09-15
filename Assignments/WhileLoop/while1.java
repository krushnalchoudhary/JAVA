/*
Write a program to print a table of 2
Output: 2 4 6 8 10 12 14 16 18 20
 */

import java.io.*;
public class while1 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=10){
            System.out.println(num*i);
            i++;
        }
    }
}
