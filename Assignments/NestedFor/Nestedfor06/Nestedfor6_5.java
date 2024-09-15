/*
Write a program to take range as input from the user and print perfect numbers.
{Note: Perfect number is the one whose perfect divisor’s addition is equal to that number.
6 is perfect number = 1 + 2 + 3 = 6}
 */

 import java.io.*;
public class Nestedfor6_5 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the starting number");
        int str = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending number");
        int end = Integer.parseInt(br.readLine());


        for(int i=str; i<=end; i++){
            int sum =  0;
            for(int j=1; j<i; j++){

                if(i%j==0){
                    sum = sum+j;
                }
            }
            if(sum==i){
                System.out.print(i+" ");
               }
        }
    }
}
