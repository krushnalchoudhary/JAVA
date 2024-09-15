/*
Write a program to count number of words in a String 

EXAMPLE : INPUT => CORE2WEB OUTPUT => 8
 */

import java.io.*;
public class String02 {
    public static void main(String[] args)throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the String");
        String str = br.readLine();

        char arr[] = str.toCharArray();
      
        System.out.println("No of Characters in string are :- "+arr.length);
    }
}
