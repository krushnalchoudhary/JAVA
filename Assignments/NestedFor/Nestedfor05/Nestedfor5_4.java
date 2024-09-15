/*
  WAP to print all even numbers in reverse order and odd numbers in the standard way. Both separately.
Within a range. Take the start and end from user
Input: Enter start number - 2
Enter End number - 9
Output:
8 6 4 2
3 5 7 9
 */


import java.io.*;
public class Nestedfor5_4{
    public static void main(String[] args) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter start no");
        int str= Integer.parseInt(br.readLine());

        System.out.println("Enter End number");
        int end = Integer.parseInt(br.readLine());
        
        for(int i=str; i<=end; i++){
            if(i%2!=0){
               System.out.print(i+" ");
               
            }
        }
        System.out.println();
        for( int j =end; j>=str; j--){
                if(j%2==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
    }
   
}


