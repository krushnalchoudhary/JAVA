/*
 Write a java program to reverse a String without using reverse().

EXAMPLE : INPUT => CORE2WEB OUTPUT => BEW2EROC
 */

import java.io.*;
public class String01 {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the String");
        String str = br.readLine();

        char arr[] = str.toCharArray();
      
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
        
    }
}
