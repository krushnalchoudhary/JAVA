/*
 5 4 3 2 1 
 8 6 4 2 
 9 6 3 
 8 4 
 5 
 */


import java.io.*;
public class Nestedfor5_3 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter rows");
        int row = Integer.parseInt(br.readLine());

        int temp = row;
        for(int i=1;  i<=row; i++){
            
            int num = temp * i;
            for(int j=1; j<=row-i+1; j++){
                System.out.print(num+" ");
                num = num-i;
            }
            temp--;
            System.out.println();
        }
        
    }
}
