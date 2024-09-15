/*
write a program to print a series of prime numbers from entered range. ( Take a start and end number
from a user )
Perform dry run at least from 10 to 20 ...
Input:-
Enter starting number: 10
Enter ending number: 100
Output:-
Series = 11 13 17 19 ..... 89 97
 */


 import java.io.*;
public class Nestedfor5_10 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Starting number");
        int str = Integer.parseInt(br.readLine());

        System.out.println("Enter the End point");
        int end = Integer.parseInt(br.readLine());

        for(int i=str; i<end; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
                
            }
            if(count==2){
                System.out.print(i+" ");
            }
        } 
    }
}
