/*
write a program to print a series of strong numbers from entered range. ( Take a start and end number
from a user )
Input:-
Enter starting number: 1
Enter ending number: 150
 */
import java.io.*;
public class Nestedfor6_9 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the starting number");
        int str = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending number");
        int end = Integer.parseInt(br.readLine());

        for(int i=str; i<=end; i++){
          int x = i;
          int sum = 0;
          while(x!=0){
            int fact = 1;
            int dig = x%10;
            for(int j=1; j<=dig; j++){
              fact = fact*j;
            }
            sum = sum + fact;
            x = x/10;
          }
          if(sum == i){
            System.out.print(i+" ");
          }
        }
    }
}
