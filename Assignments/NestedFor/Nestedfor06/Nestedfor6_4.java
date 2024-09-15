/*
Write a program to take a range as input from the user and print perfect cubes between that range.
Input: Enter start: 1
Enter end: 100
 */

 import java.io.*;
public class Nestedfor6_4 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the starting number");
        int str = Integer.parseInt(br.readLine());

        System.out.println("Enter the Ending Number");
        int end = Integer.parseInt(br.readLine());

        for(int i=str; i<=end; i++){
            for(int j=1; j<=i; j++){
                if(j*j*j==i){
                    System.out.println(i+" ");
                }
            }
        }
    }
}
